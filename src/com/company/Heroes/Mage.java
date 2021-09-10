package com.company.Heroes;

public class Mage extends Hero {
    int magicDamage;
    public Mage(int hp, int dmg, int lvl, int magicDamage){
        super(hp, dmg, lvl);
        this.magicDamage=magicDamage;
    }
    void magicAttack(){
        System.out.println("Mage's made a magic damage");
        dmg+=magicDamage;
    }
}
