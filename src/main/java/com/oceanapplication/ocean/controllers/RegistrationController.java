package com.oceanapplication.ocean.controllers;

import com.oceanapplication.ocean.models.Account;
import com.oceanapplication.ocean.services.RegistrationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/reg")
public class RegistrationController {

  private final RegistrationService registrationService;

  public RegistrationController(RegistrationService registrationService) {
    this.registrationService = registrationService;
  }

  @PostMapping
  public Account regNewAccount(@RequestBody String phoneNumber) {
    return registrationService.regNewAccount(phoneNumber);
  }
}