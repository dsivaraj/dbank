package com.dbank.service.user.interfaces;
import com.dbank.service.user.dto.UserDTO;

import java.util.Map;

public interface ListUsers {
  public Map<String,UserDTO> get();
}
