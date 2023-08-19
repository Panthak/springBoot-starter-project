package com.example.HelloWorld.rest;

import com.example.HelloWorld.Gym;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerClass {
    private Gym myWorkout;
    @Autowired
    public RestControllerClass(Gym gym){
        myWorkout = gym;
    }

    @GetMapping("workout")
    public String getWorkout(){
        return myWorkout.getWorkout();
    }

    //expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }


}
