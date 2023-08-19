package com.example.HelloWorld.rest;

import com.example.HelloWorld.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerClass {
    private Coach myCoach;

    @Autowired
    public RestControllerClass(@Qualifier("cricketCoach") Coach coach){
        myCoach = coach;
    }

    @GetMapping("coachInfo")
    public String getCoachName(){
        return myCoach.getCoachName();
    }

    //expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }


}
