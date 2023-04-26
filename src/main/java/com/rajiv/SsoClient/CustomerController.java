package com.rajiv.SsoClient;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @GetMapping("/")
    public String getCustomer() {
        return "Rajiv";
    }

    @GetMapping("/ac")
    public String getCustomerAccounts() {
        return "2004";
    }
}
