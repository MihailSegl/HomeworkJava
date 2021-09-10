package com.company.Academies;

import com.company.Heroes.Healer;
import com.company.Trainee;

public class PriestAcademy extends Academy{

    PriestAcademy(){
        System.out.println("Academy for priest is created");
    }

    @Override
    public void teach(Trainee trainee) {
        if(trainee instanceof Healer){
            trainee.train();
        }else System.out.println("Can't train anybody except priest");
    }
}
