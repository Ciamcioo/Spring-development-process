package com.myapplication.app.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * FunRestController -> Here I'm implementing the rest controler for the web application
 */
@RestController
public class FunRestController {

  @Value("${user.name}")
  private String name;


  // expose "/" that return "Hello World" -> As I'm getting it, it is like a entry URL which will dispaly something
  @GetMapping("/")
  public String sayHello() {
    return "Hello " + name;

  }
  
}
