package com.dbank.service.user.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

public class AmountDTO {
  @JsonProperty("amount")
  private long amount;

  @JsonCreator
  public AmountDTO(@JsonProperty("amount") long amount ) {
    this.amount = amount;
  }
  public Long getAmount() {return amount;}

  public void setAmount(Long newAmount) { this.amount = newAmount;}
}
