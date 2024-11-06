package com.springcourse.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component // Component annotation marks the class as Spring bean which allows to injection of control and dependency injection
public class CricketCoach implements Coach {

  public CricketCoach() {
    System.out.println("In constructor: " + getClass().getSimpleName());
  }

  @Override
  public String getDailyWorkout() {
    return "Practice fast bowling for 15 minutes!!!";
  }
  
}
