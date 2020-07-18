package com.dbank.web.controller.user;

import org.springframework.web.bind.annotation.RestController;
import com.dbank.service.user.interfaces.DeleteUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class DeleteUserController {
  private final DeleteUser deleteUser;

  public DeleteUserController(DeleteUser deleteUser) {
    this.deleteUser = deleteUser;
  }

  @GetMapping("api/v1/delete/{user}")
  public void delete(@PathVariable("user") String user) {
    deleteUser.delete(user);
  }
}
