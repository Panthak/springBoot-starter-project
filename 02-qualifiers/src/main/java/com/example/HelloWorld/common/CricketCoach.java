package com.example.HelloWorld.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getCoachName(){
        return "MS Dhoni";
    }
}
