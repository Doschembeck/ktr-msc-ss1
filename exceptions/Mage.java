package com.deschombeck.exceptions;

import java.text.MessageFormat;

public class Mage extends Character{

    public Mage(String name) {
        super(name, "Mage");
        this.life = 70;
        this.strength = 3;
        this.agility = 10;
        this.wit = 10;

        printAnnounce("May this gods be with me.");
    }

    @Override
    public void moveRight() {
        System.out.println(MessageFormat.format("{0}: {1}", this.name, "moves right furtively ."));
    }

    @Override
    public void moveLeft() {
        System.out.println(MessageFormat.format("{0}: {1}", this.name, "moves left furtively ."));
    }

    @Override
    public void moveForward() {
        System.out.println(MessageFormat.format("{0}: {1}", this.name, "moves forward furtively .\n"));
    }

    @Override
    public void moveBack() {
        System.out.println(MessageFormat.format("{0}: {1}", this.name, "moves back furtively ."));
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
            super.attack("Feel the power of my" + weapon);
        }

    }

}
