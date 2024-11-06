package com.springcourse.springcoredemo.common;

import org.springframework.stereotype.Component;

/**
 * BaseballCoach
 */
@Component
public class BaseballCoach implements Coach {

  @Override
  public String getDailyWorkout() {
    return "Practice passes";
  }

  
}
