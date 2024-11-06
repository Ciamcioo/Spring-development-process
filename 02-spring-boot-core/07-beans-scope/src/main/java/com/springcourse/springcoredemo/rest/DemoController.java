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
  private Coach firstCoach, secondCoach, thirdCoach, fourthCoach;

  @Autowired
  public DemoController(@Qualifier("cricketCoach") Coach coach, @Qualifier("cricketCoach") Coach secondCoach, @Qualifier("baseballCoach") Coach thirdCoach, @Qualifier("baseballCoach") Coach fourthCoach) {
    System.out.println("In constructor: " + getClass().getSimpleName());
    this.firstCoach = coach;
    this.secondCoach = secondCoach;
    this.thirdCoach = thirdCoach;
    this.fourthCoach = fourthCoach;
  }

  @GetMapping("/dailyworkout")
  public String getMethodName() {
      return firstCoach.getDailyWorkout();
  }

  @GetMapping("/check/cricketCoaches")
  public String checkCricketCoaches() {
    return firstCoach == secondCoach ? "The same coaches" : "Different coaches";
  }

 @GetMapping("/check/baseballCoaches")
 public String checkBaseballCoaches() {
    return thirdCoach == fourthCoach ? "The same coaches" : "Different coaches";
 }
  

}
