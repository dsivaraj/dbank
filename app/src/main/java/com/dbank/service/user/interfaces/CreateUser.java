package com.dbank.service.user.interfaces;

import com.dbank.service.user.dto.UserDTO;

public interface CreateUser {
  void create(String user, UserDTO userDetails);
}
