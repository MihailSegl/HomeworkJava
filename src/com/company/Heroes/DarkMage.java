package com.company.Heroes;

final public class DarkMage extends Mage{

    public DarkMage(int hp, int dmg, int lvl, int magicDamage){
        super(hp,dmg,lvl,magicDamage);
    }

    @Override
    public void magicAttack(){
        System.out.println("Dark mage's made magic damage!!!");
        dmg+=magicDamage;
    }
}
