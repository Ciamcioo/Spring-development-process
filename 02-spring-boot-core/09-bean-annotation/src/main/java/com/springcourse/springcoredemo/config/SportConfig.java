package com.springcourse.springcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springcourse.springcoredemo.common.Coach;
import com.springcourse.springcoredemo.common.SwimmingCoach;


// It's good practice to create a dir "config" where you put the classes responsible for configuration of third part jar classes to make use of them in out spring application

@Configuration
public class SportConfig {

  // Bean id is swimmingCoach. In a brackets we have customized bean id for the method
  @Bean("swimCoach")
  public Coach swimmingCoach() {
    return new SwimmingCoach();
  }
  
}
