package com.springcourse.springcoredemo.common;

import org.springframework.stereotype.Component;

/**
 * VolleyballCoach
 */
@Component
public class VolleyballCoach implements Coach {

  @Override
  public String getDailyWorkout() {
    return "Practice services";
  }

  
}
