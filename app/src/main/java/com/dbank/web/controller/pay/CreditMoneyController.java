package com.dbank.web.controller.pay;

import org.springframework.web.bind.annotation.RestController;
import com.dbank.service.pay.interfaces.CreditMoney;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class CreditMoneyController {
  private final CreditMoney creditMoney;

  public CreditMoneyController(CreditMoney creditMoney) {
    this.creditMoney = creditMoney;
  }

  @PostMapping("/api/v1/credit/{user}")
  public void credit() {

  }
}
