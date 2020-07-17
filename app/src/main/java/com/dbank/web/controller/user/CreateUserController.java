package com.dbank.web.controller.user;

import  com.dbank.service.user.dto.UserDTO;

import org.springframework.web.bind.annotation.RestController;
import com.dbank.service.user.interfaces.CreateUser;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
public class CreateUserController {
  private final CreateUser createUser;

  public CreateUserController(CreateUser createUser) {
    this.createUser = createUser;
  }

  @PostMapping("api/v1/create/{user}")
  @ResponseStatus(HttpStatus.CREATED)
  @ResponseBody
  public void create(@PathVariable("user") String user,
                     @RequestBody UserDTO userDetails) {
       createUser.create(user,userDetails);
  }
}
