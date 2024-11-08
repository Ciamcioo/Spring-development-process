package com.springcourse.springcoredemo.common;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component // Component annotation marks the class as Spring bean which allows to injection of control and dependency injection
// This type @Scope annotation is also correct
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

  public CricketCoach() {
    System.out.println("In constructor: " + getClass().getSimpleName());
  }

  // define initialization method invoked after constructor.  
  @PostConstruct
  public void doMyStartupStuff() {
    System.out.println("In doMyStartupStaff: " + getClass().getSimpleName());
  }

  // define destruction method invoked before constructor 
  @PreDestroy
  public void doMyCleanupStaff() {
    System.out.println("In doMyCleanupStaff : " + getClass().getSimpleName());
  }

  @Override
  public String getDailyWorkout() {
    return "Practice fast bowling for 15 minutes!!!";
  }
  
}
