package com.example.monitor.Controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class AccountController {

    @GetMapping("/account")
    public String getAccount() {
        return "This is a secured account endpoint!";
    }
}
