package com.springcourse.springcoredemo.common;

import org.springframework.stereotype.Component;

/**
 * VolleyballCoach
 */
@Component
public class VolleyballCoach implements Coach {

  public VolleyballCoach() {
    System.out.println("In constructor: " + getClass().getSimpleName());
  }

  @Override
  public String getDailyWorkout() {
    return "Practice services";
  }

  
}
