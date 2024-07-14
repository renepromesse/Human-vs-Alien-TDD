package com.renepromesse;

public class Alien extends Specy {
    private String planet;
    private Superpower superPowers = null;

    public Alien(String name, int age, String height, String weight, String planet) {
        super(name, age, height, weight);
        this.planet = planet;
        if (planet.equals("MARS")) {
            this.superPowers = new Superpower(planet, "Kinds of Alien that can Fly and teleport.");
        }
        if (planet.equals("PLUTO")) {
            this.superPowers = new Superpower(planet, "Kinds of Alien that can Mutate and Dream.");
        }
    }

    public void fly() {
        if (this.planet.equals("MARS")) {
            System.out.println("Yeaaah Flying is terrific... 🛸️");
        } else {
            System.out.println("Sorry, Flying is not my things...");
        }
    }

    public void teleport() {
        if (this.planet.equals("MARS")) {
            System.out.println("Now I'm a Ghost 👻️");
        } else {
            System.out.println("Sorry, I can't teleport!");
        }
    }

    public void mutate() {
        if (this.planet.equals("PLUTO")) {
            System.out.println("Now I'm King Shark 🧞️");
        } else {
            System.out.println("Sorry, I cannot Mutate!");
        }
    }

    public void dream() {
        if (this.planet.equals("PLUTO")) {
            System.out.println("Sorry I'm currently unresponsive while dreaming 💤️");
        } else {
            System.out.println("Sorry, On this planet we don't Dream!");
        }
    }

    // getters and setters

    public String getPlanet() {
        return this.planet;
    }

    public Superpower getSuperPowers() {
        return this.superPowers;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public void setSuperPowers(Superpower superPowers) {
        this.superPowers = superPowers;
    }

}
