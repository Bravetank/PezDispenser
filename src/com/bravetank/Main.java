package com.bravetank;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("We are making a new PEZ Dispenser");
        System.out.printf
                ("Fun fact - you can only put %d pez in each dispenser %n",
                        PezDispenser.MAX_PEX);
        //NB note the capitals PezDispenser - accessing a class variable here
        //Don't need the instance

        PezDispenser pezDispenser = new PezDispenser("Yoda");
        System.out.printf
                ("The dispenser is a %s dispenser %n", pezDispenser.getCharacterName());

        if (pezDispenser.isEmpty()) {
            System.out.println("The PEZ Dispenser is empty");
        }
        System.out.println("Filling the PEZ Dispenser...");
        pezDispenser.fill();
        if (!pezDispenser.isEmpty()) {
            System.out.println("The PEZ Dispenser is full");
        }

        while (pezDispenser.dispense()) {
            System.out.println("CHOMP");
        }
        try {
            pezDispenser.fill(14);
            System.out.println("You won't see this");
        } catch (IllegalArgumentException iae) {
            System.out.println("Whoa there!");
            System.out.printf("The error was %s %n", iae.getMessage());
        }
    }

}
