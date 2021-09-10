package com.company;

import com.company.Heroes.Cossack;
import com.company.Heroes.HealerDruid;
import com.company.Weapons.CavalrySword;

public class Main {

    public static void main(String[] args) {
        HealerDruid dima = new HealerDruid(10,1,3, 5);
        //dima.animal.setName("Koshka");
        //dima.animal.setDmg(2);
        //dima.animal.setHp(15);
        dima.setAnimal(new Animal(3, 3, "Barsik"));
        dima.setAnimalName();
        dima.setLvl(3);
        //dima.setDmg(1);
        System.out.println(dima.getDmg());
        dima.attackLikeAnimal();
        dima.info();
        Cossack cossack1 = new Cossack(5,1, 3, 4);
        cossack1.setCavalrySword(new CavalrySword());
        cossack1.deathSword.name = "SwordOfDeath";
        cossack1.deathSword.damage = 5;
    }
}
