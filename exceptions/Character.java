package com.deschombeck.exceptions;

import java.text.MessageFormat;

public abstract class Character implements Movable{

    protected String name;
    protected int life;
    protected int agility;
    protected int strength;
    protected int wit;
    final String RpgClass;

    public Character(String name, String rpgClass) {
        this.name = name;
        RpgClass = rpgClass;
        this.life = 50;
        this.agility = 2;
        this.strength = 2;
        this.wit = 2;
    }

    private void unsheathe(){
        System.out.println(MessageFormat.format("{0}: {1}", this.name, "unsheathes his weapon ."));
    }

    @Override
    public void moveRight() {
        System.out.println(MessageFormat.format("{0}: {1}", this.name, "moves right"));
    }

    @Override
    public void moveLeft() {
        System.out.println(MessageFormat.format("{0}: {1}", this.name, "moves left"));
    }

    @Override
    public void moveForward() {
        System.out.println(MessageFormat.format("{0}: {1}", this.name, "moves forward"));
    }

    @Override
    public void moveBack() {
        System.out.println(MessageFormat.format("{0}: {1}", this.name, "moves back"));
    }

    public void printAnnounce(String str){
        System.out.println(this.name + ": " + str);
    }

    public void attack(String str) throws WeaponException {
        System.out.println(MessageFormat.format("{0}: {1}", this.name, "Rrrrrrrrr...."));
        System.out.println(MessageFormat.format("{0}: {1}", this.name, str));
    }

    public void tryToAttack(String str){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public String getRpgClass() {
        return RpgClass;
    }
}
