package com.springcourse.springcoredemo.common;
import org.springframework.stereotype.Component;

/**
 * HockeyCoach
 */
@Component
public class HockeyCoach implements Coach {

  public HockeyCoach() {
    System.out.println("In constructor: " + getClass().getSimpleName());
  }


  @Override
  public String getDailyWorkout() {
    return "Practice ice skating for an hour!";
  }

  
}
