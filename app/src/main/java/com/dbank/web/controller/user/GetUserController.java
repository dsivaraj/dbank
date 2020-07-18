package com.dbank.web.controller.user;

import com.dbank.service.user.dto.UserDTO;
import com.dbank.service.user.interfaces.GetUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetUserController {
  private final GetUser getUser;

  public GetUserController(GetUser getUser) {
    this.getUser = getUser;
  }

  @GetMapping("api/v1/{user}")
  public  UserDTO get(@PathVariable("user") String user) {
    return getUser.get(user);
  }
}
