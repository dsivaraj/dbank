package com.dbank.service.pay.interfaces;

public interface TransferMoney {
  public void transfer(String user, String beneficiary, Long amount);
}
