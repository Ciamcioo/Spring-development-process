package com.springcourse.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * VolleyballCoach
 */
@Component
@Primary // makes class as default for not specified implementation of coach
public class VolleyballCoach implements Coach {

  @Override
  public String getDailyWorkout() {
    return "Practice services";
  }

  
}
