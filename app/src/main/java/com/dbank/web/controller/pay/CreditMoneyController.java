package com.dbank.web.controller.pay;

import com.dbank.service.pay.interfaces.CreditMoney;
import com.dbank.service.user.dto.AmountDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditMoneyController {
  private final CreditMoney creditMoney;

  public CreditMoneyController(CreditMoney creditMoney) {
    this.creditMoney = creditMoney;
  }

  @PostMapping("/api/v1/credit/{user}")
  public void credit(@PathVariable("user") String user,
                     @RequestBody AmountDTO amount) {
    creditMoney.credit(user,amount);

  }
}
