package com.dbank.service.pay.interfaces;
import com.dbank.service.pay.dto.AmountDTO;
public interface CreditMoney {
  public void credit(String user,AmountDTO amount);
}
