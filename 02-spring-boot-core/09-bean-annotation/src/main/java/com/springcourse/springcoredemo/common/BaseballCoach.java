package com.springcourse.springcoredemo.common;

import org.springframework.stereotype.Component;

/**
 * BaseballCoach
 */
@Component
public class BaseballCoach implements Coach {

  public BaseballCoach() {
    System.out.println("In constructor: " + getClass().getSimpleName());
  }

  @Override
  public String getDailyWorkout() {
    return "Practice passes";
  }

  
}
