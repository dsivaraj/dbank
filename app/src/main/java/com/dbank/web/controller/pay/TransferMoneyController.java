package com.dbank.web.controller.pay;

import org.springframework.web.bind.annotation.RestController;
import com.dbank.service.pay.interfaces.TransferMoney;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class TransferMoneyController {
  private final TransferMoney transferMoney;

  public TransferMoneyController(TransferMoney transferMoney) {
    this.transferMoney = transferMoney;
  }

  @PostMapping("/api/v1/transfer/{user}")
  public void transfer() {

  }
}
