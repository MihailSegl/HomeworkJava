package com.company.Academies;

import com.company.Heroes.Warrior;
import com.company.Trainee;

public class WarriorAcademy extends Academy{

    WarriorAcademy(){
        System.out.println("Academy for warriors is created");
    }

    @Override
    public void teach(Trainee trainee){
        if(trainee instanceof Warrior){
            trainee.train();
        } else System.out.println("Can't teach anybody except warrior");
    }
}
