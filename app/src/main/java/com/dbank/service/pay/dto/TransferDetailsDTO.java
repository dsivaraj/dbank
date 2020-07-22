package com.dbank.service.pay.dto;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TransferDetailsDTO {
  @JsonProperty("beneficiary")
  private String beneficiaryUser;
  private Long amount;

  @com.fasterxml.jackson.annotation.JsonCreator
  public TransferDetailsDTO(@JsonProperty("beneficiary") String beneficiaryUser,
                            @JsonProperty("amount") Long amount) {
    this.beneficiaryUser = beneficiaryUser;
    this.amount = amount;
  }

  public String getBeneficiaryUser() {
    return beneficiaryUser;
  }

  public Long getTransferAmount() {
    return amount;
  }
}
