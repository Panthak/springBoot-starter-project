package com.example.HelloWorld.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    public CricketCoach(){
        System.out.println("#"+this.getClass().getSimpleName()+" created.");
    }
    @Override
    public String getCoachName(){
        return "MS Dhoni";
    }
}
