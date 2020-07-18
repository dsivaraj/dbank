package com.dbank.service.user.impl;
import com.dbank.service.user.interfaces.GetUser;
import com.dbank.service.user.dto.UserDTO;
import  com.dbank.data.user.UserData;
import org.springframework.stereotype.Service;

@Service
public class GetUserImpl implements GetUser {
  public UserDTO get(String user) {
    UserData.getInstance();
    return  UserData.getUserDetails(user);
  }
}
