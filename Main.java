package com.deschombeck;

import com.deschombeck.exceptions.Character;
import com.deschombeck.exceptions.Mage;
import com.deschombeck.exceptions.Warrior;
import com.deschombeck.exceptions.WeaponException;

public class Main {

    public static void main(String[] args) {

        testExceptions();

    }

    public static void testExceptions(){
        Character warrior = new Warrior ("Jean -Luc") ;
        Character mage = new Mage (" Robert ") ;

        try {
            warrior.attack("Hammer");
        } catch (WeaponException e) {
            System.out.println(e.getMessage());
        }

    }

}
