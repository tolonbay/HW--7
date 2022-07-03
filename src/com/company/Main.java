package com.company;

public class Main {

    public static void main(String[] args) {
        Medic medic = new Medic(200, 20, "Health");

        Magic magic = new Magic(150, 30, "Strong Damage");

        Warrior warrior = new Warrior(250, 25, "One Shot");

        Hero[] hero = {magic, medic, warrior};
        for (Hero i:  hero) {
            System.out.println(i.getClass().getSimpleName()
                    + " health: " + i.getHealth() + "\ndamage: " + i.getDamage() + "  Супер способност : "
                    + i.getSuperAbilityType());
        }


       /* Medic medic = new Medic();
        medic.applySuperAbility("Strong Damage");

        Warrior warrior = new Warrior();
        warrior.applySuperAbility("Critical Damage");
        */


    }
}
