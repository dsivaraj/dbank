package com.dbank.web.controller.pay;

import org.springframework.web.bind.annotation.RestController;
import com.dbank.service.pay.interfaces.TransferMoney;
import com.dbank.service.pay.dto.TransferDetailsDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class TransferMoneyController {
  private final TransferMoney transferMoney;

  public TransferMoneyController(TransferMoney transferMoney) {
    this.transferMoney = transferMoney;
  }

  @PostMapping("/api/v1/transfer/{user}")
  public void transfer(@PathVariable("user") String user,
                       @RequestBody TransferDetailsDTO transferDetailsDTO) {

    transferMoney.transfer(user,transferDetailsDTO.getBeneficiaryUser(),transferDetailsDTO.getTransferAmount());
  }
}
