package com.dbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MainApp {

  @RequestMapping("/")
  public String home() {
    return "Happy Banking";
  }

  public static void main(String[] args) {
    SpringApplication.run(MainApp.class, args);
  }

}