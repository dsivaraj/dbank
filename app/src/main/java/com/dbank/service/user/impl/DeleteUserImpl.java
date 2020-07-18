package com.dbank.service.user.impl;

import com.dbank.service.user.interfaces.DeleteUser;
import com.dbank.data.user.UserData;
import org.springframework.stereotype.Service;

@Service
public class DeleteUserImpl implements DeleteUser {
  public void delete(String user) {
   UserData.getInstance();
   UserData.deleteUser(user);
  }
}
