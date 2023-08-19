package com.example.HelloWorld;

import org.springframework.stereotype.Component;

@Component
public class GymClass implements Gym{
    @Override
    public String getWorkout() {
        return "Go to the gym daily!";
    }
}
