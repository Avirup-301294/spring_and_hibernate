package com.avirup.java_annotation_ioc;

import org.springframework.stereotype.Component;

// @Component("theSillyCoach") 
@Component 
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley!";

    }
}
