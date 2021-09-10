package com.company.Heroes;

import com.company.Trainee;
import com.company.Weapons.CavalrySword;

public class Cossack extends Warrior implements Trainee {

    public CavalrySword deathSword;

    public Cossack(int hp, int dmg, int lvl, int multipleDmg) {
        super(hp, dmg, lvl, multipleDmg);
    }
    public void setCavalrySword(CavalrySword deathSword){
        this.deathSword=deathSword;
    }

    public void info(){
        super.info();
        if(deathSword!=null){
            System.out.println(deathSword.name);
            System.out.println(deathSword.damage);
        }
    }

    public void hack(){
        if(deathSword!=null){
            dmg += deathSword.damage;
        }
    }

    @Override
    public void train() {
        dmg++;
        System.out.println("My damage was increased on 1 point");
    }
}
