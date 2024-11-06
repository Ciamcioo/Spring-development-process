package com.springcourse.springcoredemo.common;

import org.springframework.stereotype.Component;

/**
 * HockeyCoach
 */
@Component
public class HockeyCoach implements Coach {

  @Override
  public String getDailyWorkout() {
    return "Practice ice skating for an hour!";
  }

  
}
