package com.dbank.service.pay.impl;

import com.dbank.service.pay.dto.AmountDTO;
import  com.dbank.service.pay.interfaces.CreditMoney;
import com.dbank.service.pay.interfaces.DebitMoney;
import com.dbank.service.pay.interfaces.TransferMoney;
import org.springframework.stereotype.Service;

@Service
public class TransferMoneyImpl implements TransferMoney {


  private CreditMoney creditMoney = new CreditMoneyImpl();
  private DebitMoney debitMoney = new DebitMoneyImpl();

  public void TransferMoneyImpl( CreditMoney creditMoney, DebitMoney debitMoney) {
    this.creditMoney = creditMoney;
    this.debitMoney = debitMoney;
  }

  public void transfer(String user, String beneficiary, Long amount) {
      //Call Debit Interface with user and amount
       debitMoney.debit(user,new AmountDTO(amount));
    //Call Credit Interface with beneficiary and amount
       creditMoney.credit(beneficiary,new AmountDTO(amount));
  }
}
