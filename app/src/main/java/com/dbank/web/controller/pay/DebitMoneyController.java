package com.dbank.web.controller.pay;

import org.springframework.web.bind.annotation.RestController;
import com.dbank.service.pay.interfaces.DebitMoney;
import com.dbank.service.user.dto.AmountDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class DebitMoneyController {
  private final DebitMoney debitMoney;

  public DebitMoneyController(DebitMoney debitMoney) {
    this.debitMoney = debitMoney;
  }

  @PostMapping("/api/v1/debit/{user}")
  public void debit(@PathVariable("user") String user,
                    @RequestBody AmountDTO amount) {

    debitMoney.debit(user,amount);
  }
}
