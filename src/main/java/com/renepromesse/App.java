package com.renepromesse;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String cityName = "MÃ¼nchen";
        String fixedCityName = App.fixEncodings(cityName);
        System.out.println(fixedCityName);
        System.out.println(App.fixEncoding(cityName));
        System.out.println("0000000000");
        System.out.println(new String("München".getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8));
        // System.out.println(
        // "Sometimes I take the meaning of life as writting a script that wouldn't be
        // written otherwise");
    }

    public static String fixEncoding(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        // Define common problematic encodings
        Charset[] charsets = {
                StandardCharsets.ISO_8859_1,
                StandardCharsets.UTF_8,
                Charset.forName("Windows-1252")
        };

        // Try different encoding combinations
        for (Charset sourceCharset : charsets) {
            for (Charset targetCharset : charsets) {
                if (!sourceCharset.equals(targetCharset)) {
                    String converted = new String(input.getBytes(sourceCharset), targetCharset);
                    if (converted.contains("ü") || converted.contains("ö") || converted.contains("ä")) {
                        System.out.println("sourceCharset" + sourceCharset + " tareget:" + targetCharset);
                        return converted;
                    }
                }
            }
        }

        // If no conversion worked, return the original string
        return input;
    }

    public static String fixEncodings(String input) {
        if (input == null) {
            return null;
        }

        // Check if the string is already correctly encoded
        if (isProperlyEncoded(input)) {
            return input;
        }

        // Try to fix common encoding issues
        try {
            byte[] bytes = input.getBytes(StandardCharsets.ISO_8859_1);
            return new String(bytes, StandardCharsets.UTF_8);
        } catch (Exception e) {
            // If conversion fails, return the original string
            return input;
        }
    }

    private static boolean isProperlyEncoded(String input) {
        return input.equals(new String(input.getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
    }
}
