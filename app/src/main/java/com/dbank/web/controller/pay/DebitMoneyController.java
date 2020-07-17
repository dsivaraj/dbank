package com.dbank.web.controller.pay;

import org.springframework.web.bind.annotation.RestController;
import com.dbank.service.pay.interfaces.DebitMoney;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class DebitMoneyController {
  private final DebitMoney debitMoney;

  public DebitMoneyController(DebitMoney debitMoney) {
    this.debitMoney = debitMoney;
  }

  @PostMapping("/api/v1/debit/{user}")
  public void debit() {

  }
}
