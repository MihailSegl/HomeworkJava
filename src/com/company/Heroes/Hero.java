package com.company.Heroes;

public class Hero {
    protected int hp, lvl, dmg;

    public Hero(int hp, int dmg, int lvl) {
        this.hp = hp;
        this.lvl = lvl;
        this.dmg = dmg;
    }
    public void info(){
        System.out.printf("HP: %s, LVL: %s, DMG: %s",this.hp,this.lvl,this.dmg);
    }

    public int getHp() {
        return hp;
    }

    public int getLvl() {
        return lvl;
    }

    public int getDmg() {
        return dmg;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }
}
