package com.deschombeck.exceptions;

import java.text.MessageFormat;

public class Warrior extends Character{
    public Warrior(String name) {
        super(name, "Warrior");
        this.life = 100;
        this.strength = 10;
        this.agility = 8;
        this.wit = 3;

        printAnnounce("My name will go down in history !");
    }

    @Override
    public void moveRight() {
        System.out.println(MessageFormat.format("{0}: {1}", this.name, "moves right like a bad boy ."));
    }

    @Override
    public void moveLeft() {
        System.out.println(MessageFormat.format("{0}: {1}", this.name, "moves left like a bad boy ."));
    }

    @Override
    public void moveForward() {
        System.out.println(MessageFormat.format("{0}: {1}", this.name, "moves forward like a bad boy ."));
    }

    @Override
    public void moveBack() {
        System.out.println(MessageFormat.format("{0}: {1}", this.name, "moves back like a bad boy ."));
    }

    @Override
    public void tryToAttack(String str) {
        super.tryToAttack(str);
    }

    @Override
    public void attack(String weapon) throws WeaponException {

        if (weapon == null || weapon.isEmpty()){
            throw new WeaponException(this.name + ": I refuse to fight with my bare hands .");
        } else {
            super.attack("I'll crush you with my" + weapon);
        }

    }
}
