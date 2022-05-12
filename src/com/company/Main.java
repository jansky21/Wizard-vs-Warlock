package com.company;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Wizards and Warlocks\n");
        //creating the objects
        Wizard Jan = new Wizard("Jan", 20, 70, 150);
        Warlock Poul = new Warlock("Poul", 10, 100, 200);

        //the implementation of method nameDisplay();
        Jan.nameDisplay();
        Poul.nameDisplay();

        //start of the sequence
        Jan.hailStorm(Poul);
        Jan.showStats();
        Jan.showStats();

        Poul.maelStorm(Jan);
        //implementation of method showStats();
        Jan.showStats();
        Poul.showStats();

        //the use of regen spell
        Jan.healSpell();
        Jan.showStats();
        Poul.showStats();

        Poul.fireBall(Jan);
        Jan.showStats();
        Poul.showStats();

        Jan.kulam(Poul);
        //the levelUp(); method
        Jan.levelUp();
    }
}
