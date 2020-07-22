package com.dbank.service.user.dto;

import com.dbank.service.pay.dto.AmountDTO;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDTO {
  @JsonProperty("firstname")
  private final String firstName;

  @JsonProperty("lastname")
  private final String lastName;

  @JsonProperty("balance")
  private AmountDTO balance;

  @JsonCreator
  public UserDTO(
    @JsonProperty("firstname") String firstName,
    @JsonProperty("lastname") String lastName,
    @JsonProperty("balance") AmountDTO balance ) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.balance = balance;
  }

  public String getFirstName() {return firstName;}

  public String getLastName() {return lastName;}

  public AmountDTO getBalance() {return balance;}

  public void setBalance(AmountDTO newBalanceAmount) {
    this.balance = newBalanceAmount;
  }

}
