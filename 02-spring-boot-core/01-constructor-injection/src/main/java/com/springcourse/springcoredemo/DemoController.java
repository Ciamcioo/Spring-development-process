package com.springcourse.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * DemoController
 */
@RestController
public class DemoController {

  // define a private field for the dependency 
  private Coach myCoach;

  // define a constructor for dependency injection
  @Autowired // If we have one constructor the annotation isn't needed, but it's good practice to use it. This annotation tells Spring to inject a dependency.
  public DemoController(Coach theCoach) {
    myCoach = theCoach; 

  }

  @GetMapping("/dailyworkout")
  public String getMethodName() {
      return myCoach.getDailyWorkout();
  }
  
  
}
