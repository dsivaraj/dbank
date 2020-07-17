package com.dbank.web.controller.user;

import org.springframework.web.bind.annotation.RestController;
import com.dbank.service.user.interfaces.ListUsers;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ListUsersController {
  private final ListUsers listUsers;

  public ListUsersController(ListUsers listUsers) {
    this.listUsers = listUsers;
  }

  @GetMapping("api/v1/listUsers")
  public void list() {

  }
}
