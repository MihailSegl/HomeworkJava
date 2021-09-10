package com.company;

public class Animal {
    int hp, dmg;
    String name;

    public Animal(int hp, int dmg, String name){
        this.hp = hp;
        this.dmg = dmg;
        this.name = name;
    }

    final public void attackLikeAnimal(){
        System.out.println("R-r-r\nI made damage for " + dmg + " points");
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
