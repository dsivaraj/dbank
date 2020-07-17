package com.dbank.web.controller.user;

import org.springframework.web.bind.annotation.RestController;
import com.dbank.service.user.interfaces.ListUsers;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class ListUsersController {
  private final ListUsers listUsers;

  public ListUsersController(ListUsers listUsers) {
    this.listUsers = listUsers;
  }

  @PostMapping("api/v1/listUsers")
  public void list() {

  }
}
