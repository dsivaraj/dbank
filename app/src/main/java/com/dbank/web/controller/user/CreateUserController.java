package com.dbank.web.controller.user;

import org.springframework.web.bind.annotation.RestController;
import com.dbank.service.user.interfaces.CreateUser;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class CreateUserController {
  private final CreateUser createUser;

  public CreateUserController(CreateUser createUser) {
    this.createUser = createUser;
  }

  @PostMapping("api/v1/create/{user}")
  public void create() {

  }
}
