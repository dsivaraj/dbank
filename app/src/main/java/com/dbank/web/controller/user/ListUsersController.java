package com.dbank.web.controller.user;

import com.dbank.service.user.dto.UserDTO;
import com.dbank.service.user.interfaces.ListUsers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ListUsersController {
  private final ListUsers listUsers;

  public ListUsersController(ListUsers listUsers) {
    this.listUsers = listUsers;
  }

  @GetMapping("api/v1/listUsers")
  public Map<String, UserDTO> list() {
     return listUsers.get();
  }
}
