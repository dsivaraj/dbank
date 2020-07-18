package com.dbank.service.pay.impl;

import com.dbank.data.user.UserData;
import com.dbank.service.user.dto.UserDTO;
import com.dbank.service.pay.interfaces.DebitMoney;
import com.dbank.service.user.dto.AmountDTO;
import org.springframework.stereotype.Service;

@Service
public class DebitMoneyImpl implements DebitMoney {
  public void debit(String user,AmountDTO amount) {
    UserData.getInstance();
    UserDTO userDetails = UserData.getUserDetails(user);
    AmountDTO balance = userDetails.getBalance();
    balance.setAmount(balance.getAmount() - amount.getAmount());
  }
}
