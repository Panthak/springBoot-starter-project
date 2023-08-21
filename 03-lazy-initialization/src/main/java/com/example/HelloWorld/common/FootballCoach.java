package com.example.HelloWorld.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class FootballCoach implements Coach{

    public FootballCoach(){
        System.out.println("#"+this.getClass().getSimpleName()+" created.");
    }
    @Override
    public String getCoachName() {
        return "Ronaldo";
    }
}
