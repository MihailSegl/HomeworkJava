package com.company.Heroes;

public class Warrior extends Hero {
    int multipleDmg;
    public Warrior(int hp, int dmg, int lvl, int multipleDmg){
        super(hp, dmg, lvl);
        this.multipleDmg = multipleDmg;
    }
    public void strongStrike(){
        dmg*=multipleDmg;
    }
}
