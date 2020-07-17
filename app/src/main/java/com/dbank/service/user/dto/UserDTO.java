package com.dbank.service.user.dto;

import com.fasterxml.jackson.annotation.JsonCreator;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDTO {
  @JsonProperty("firstname")
  private final String firstName;

  @JsonProperty("lastname")
  private final String lastName;

  @JsonProperty("balance")
  private final long balance;

  @JsonCreator
  public UserDTO(
    @JsonProperty("firstname") String firstName,
    @JsonProperty("lastname") String lastName,
    @JsonProperty("balance") long balance ) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.balance = balance;
  }

  public String getFirstName() {return firstName;}

  public String getLastName() {return lastName;}

  public Long getBalance() {return balance;}

}
