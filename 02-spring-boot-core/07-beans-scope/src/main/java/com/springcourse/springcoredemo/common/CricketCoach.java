package com.springcourse.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // Component annotation marks the class as Spring bean which allows to injection of control and dependency injection
@Scope("prototype")
// This type @Scope annotation is also correct
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

  public CricketCoach() {
    System.out.println("In constructor: " + getClass().getSimpleName());
  }

  @Override
  public String getDailyWorkout() {
    return "Practice fast bowling for 15 minutes!!!";
  }
  
}
