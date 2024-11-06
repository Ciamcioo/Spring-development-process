package com.springcourse.springcoredemo.common;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * HockeyCoach
 */
@Component
@Lazy
public class HockeyCoach implements Coach {

  public HockeyCoach() {
    System.out.println("In constructor: " + getClass().getSimpleName());
  }


  @Override
  public String getDailyWorkout() {
    return "Practice ice skating for an hour!";
  }

  
}
