package com.dbank.service.pay.interfaces;
import com.dbank.service.user.dto.AmountDTO;

public interface DebitMoney {
  public void debit(String user, AmountDTO amount);
}
