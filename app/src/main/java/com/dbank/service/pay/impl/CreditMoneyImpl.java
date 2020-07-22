package com.dbank.service.pay.impl;

import com.dbank.data.user.UserData;
import com.dbank.service.user.dto.UserDTO;
import com.dbank.service.pay.interfaces.CreditMoney;
import com.dbank.service.pay.dto.AmountDTO;
import org.springframework.stereotype.Service;

@Service
public class CreditMoneyImpl implements CreditMoney {
  public void credit(String user,AmountDTO amount) {
   UserData.getInstance();
    UserDTO userDetails = UserData.getUserDetails(user);
    AmountDTO balance = userDetails.getBalance();
    balance.setAmount(balance.getAmount() + amount.getAmount());
  }
}
