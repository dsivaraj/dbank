package com.dbank.service.user.impl;
import com.dbank.data.user.UserData;
import com.dbank.service.user.interfaces.ListUsers;
import org.springframework.stereotype.Service;
import com.dbank.service.user.dto.UserDTO;

import java.util.Map;

@Service
public class ListUsersImpl implements ListUsers {
  public Map<String,UserDTO> get() {
    UserData.getInstance();
    return UserData.getAllUsers();
  }
}
