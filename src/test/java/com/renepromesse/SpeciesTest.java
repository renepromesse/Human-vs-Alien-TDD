package com.renepromesse;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SpeciesTest {

    private final ByteArrayOutputStream newOutContext = new ByteArrayOutputStream();
    private final PrintStream originalOutContext = System.out;

    Species zombie = new Species("MARS", 200, "5000m", "10000kg");
    String meters = "1000m";

    @Before
    public void beforeEachTest() {
        // set the new output context
        System.setOut(new PrintStream(newOutContext));
    }

    @After
    public void afterEachTest() {
        // set back the output stream to the original
        System.setOut(originalOutContext);
    }

    @Test
    public void speakTest() {
        String text = "Hey there, we can discuss if you want...";
        assertEquals(text, zombie.speak());
    }

    @Test
    public void walkTest() {
        zombie.walk(meters);
        assertEquals("I have walked " + meters + "\n", newOutContext.toString());

    }

    @Test
    public void jumpTest() {
        zombie.jump(meters);
        assertEquals("I have jumped " + meters + "\n", newOutContext.toString());
    }

    @Test
    public void sleepTest() {
        zombie.sleep(5000);
        assertEquals("I have slept for " + 5000 + " minutes long." + "\n", newOutContext.toString());
    }

    @Test
    public void gettersTest() {
        assertEquals("MARS", zombie.getName());
        assertEquals(200, zombie.getAge());
        assertEquals("5000m", zombie.getHeight());
        assertEquals("10000kg", zombie.getWeight());
    }

    @Test
    public void settersTest() {
        zombie.setName("Test");
        assertEquals("Test", zombie.getName());
        zombie.setAge(1000);
        assertEquals(1000, zombie.getAge());
        zombie.setWeight("10kg");
        assertEquals("10kg", zombie.getWeight());
        zombie.setHeight("10m");
        assertEquals("10m", zombie.getHeight());

    }

}
