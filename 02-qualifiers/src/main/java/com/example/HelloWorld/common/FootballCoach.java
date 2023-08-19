package com.example.HelloWorld.common;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

    @Override
    public String getCoachName() {
        return "Ronaldo";
    }
}
