package com.dbank.data.user;

import com.dbank.service.user.dto.UserDTO;

import java.util.HashMap;
import java.util.Map;

public final class UserData {

  private static UserData userData = null;

  private static Map<String, UserDTO> userMap;

  private UserData(){
     userMap = new HashMap<>();
  }


  public static UserData getInstance() {
    if (userData == null) {
      userData = new UserData();
    }
    return userData;
  }

  public static void addUser(String user,UserDTO userDetails) {
      userMap.put(user,userDetails);
  }

  public static void deleteUser(String user) {
    userMap.remove(user);
  }

  public static Map<String,UserDTO> getAllUsers() {
    return userMap;
  }

}
