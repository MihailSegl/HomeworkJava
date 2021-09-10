package com.company.Heroes;

import com.company.Animal;
import com.company.Trainee;

public class HealerDruid extends Healer implements Trainee {
    private Animal animal1;
    public HealerDruid(int hp, int dmg, int lvl, int powerOfHeal){
        super(hp, dmg, lvl, powerOfHeal);
    }
    public HealerDruid(int hp, int dmg, int lvl){
        super(hp,dmg,lvl);
    }

    public void setAnimal(Animal animal1){
        this.animal1=animal1;
    }

    @Override
    public void info(){
        super.info();
        if(animal1!=null){
            animal1.getName();
            animal1.getHp();
            animal1.getDmg();
        }
        getPowerOfHeal();
    }

    public void attackLikeAnimal(){
        animal1.attackLikeAnimal();
    }

    public void setAnimalName(){
        animal1.setName("name");
    }

    @Override
    public void train() {
        powerOfHeal++;
        System.out.println("My power of heal increased on 1 point");
    }
}
