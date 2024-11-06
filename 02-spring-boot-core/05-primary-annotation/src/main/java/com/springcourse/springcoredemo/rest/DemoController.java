package com.springcourse.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.springcourse.springcoredemo.common.*; // <- it's need to be here no matter tha fact that we are scanning for components with use of Spring 


/**
 * DemoController
 */
@RestController
public class DemoController {

  // define a private field for the dependency 
  private Coach myCoach;

  @Autowired
  public DemoController(Coach coach) {
    myCoach = coach;
  }

  @GetMapping("/dailyworkout")
  public String getMethodName() {
      return myCoach.getDailyWorkout();
  }

}
