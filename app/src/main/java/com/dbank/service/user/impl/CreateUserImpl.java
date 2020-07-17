package com.dbank.service.user.impl;

import com.dbank.data.user.UserData;
import com.dbank.service.user.dto.UserDTO;
import com.dbank.service.user.interfaces.CreateUser;
import org.springframework.stereotype.Service;

@Service
public class CreateUserImpl implements CreateUser {
  public void create(String user,UserDTO userDetails) {
    UserData.getInstance();
    UserData.addUser(user,userDetails);
  }
}
