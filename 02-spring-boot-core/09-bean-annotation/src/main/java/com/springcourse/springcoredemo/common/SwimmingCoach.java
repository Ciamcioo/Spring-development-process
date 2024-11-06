package com.springcourse.springcoredemo.common;

public class SwimmingCoach implements Coach {
  
  public SwimmingCoach() {
    System.out.println("In constructor: " + getClass().getSimpleName());
  }

  @Override
  public String getDailyWorkout() {
    return "Do a quick warm up and then practice sprints.";
  }
  
  
}
