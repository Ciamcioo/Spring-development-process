package com.myapplication.app.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * FunRestController -> Here I'm implementing the rest controler for the web application
 */
@RestController
public class FunRestController {

  // inject propperties for coach.name and team.name 
  @Value("${user.name}")
  private String name;

  @Value("${coach.name}")
  private String coachName;

  @Value("${team.name}")
  private String teamName;

  // expose "/" that return "Hello World" -> As I'm getting it, it is like a entry URL which will dispaly something
  @GetMapping("/")
  public String sayHello() {
    return "Hello " + name;

  }

  // expose a new endpoint for "workout"
  @GetMapping("/workout")
  public String getDailyWorkout() {
    return name + ", you need to run 5k!!! ~ " + coachName;
  }

  @GetMapping("/team")
  public String getTeamMembers() {
      return "Team name is: " + teamName; 
  }
  

  // expose a new endpoint for "fourtune"
  @GetMapping("/fortune")
  public String getFortune() {
    return name + ", you are lucky."; 
  }
  
}
