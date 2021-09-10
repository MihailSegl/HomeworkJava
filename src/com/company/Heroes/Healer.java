package com.company.Heroes;

public class Healer extends Hero {
    protected int powerOfHeal;

    public Healer(int hp, int dmg, int lvl, int powerOfHeal) {
        super(hp,dmg,lvl);
        this.powerOfHeal=powerOfHeal;
    }
    public Healer(int hp, int dmg, int lvl){
        super(hp,dmg,lvl);
    }

    public void heal() {

        hp += powerOfHeal;
    }
    public void heal(Hero hero){

        hero.hp += powerOfHeal;
    }

    public int getPowerOfHeal() {

        return powerOfHeal;
    }

    public void setPowerOfHeal(int powerOfHeal) {

        this.powerOfHeal = powerOfHeal;
    }


}
