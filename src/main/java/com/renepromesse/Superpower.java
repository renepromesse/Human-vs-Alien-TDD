package com.renepromesse;

import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class Superpower {
    private String family;
    private String description;
    private Set<String> powers = new HashSet<>();

    final Set<String> families = new HashSet<>(Arrays.asList("MARS", "PLUTO"));

    // later refactor will be about using enums instead of strings;
    // enum Families {
    // MARS, PLUTO
    // }

    public Superpower(String family, String description) {
        if (families.contains(family)) {
            this.family = family;
            this.description = description;
            if (family.equals("MARS")) {
                this.powers.addAll(new HashSet<>(Arrays.asList("Fly", "Teleport")));
            }
            if (family.equals("PLUTO")) {
                this.powers.addAll(new HashSet<>(Arrays.asList("Mutate", "Dream")));
            }
        } else {
            System.out.println("Sorry, this family is not for Aliens...");
        }
    }

    // getters and setters

    public String getFamily() {
        return this.family;
    }

    public String getDescription() {
        return this.description;
    }

    public Set<String> getPowers() {
        return this.powers;
    }

    public String getPowersAsString() {
        return this.powers.toString();
    }

    public void setFamily(String family) {
        this.family = family;
        if (family.equals("MARS")) {
            this.powers.addAll(new HashSet<>(Arrays.asList("Fly", "Teleport")));
        }
        if (family.equals("PLUTO")) {
            this.powers.addAll(new HashSet<>(Arrays.asList("Mutate", "Dream")));
        }
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
