package com.sinchan.mybookaccounting.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
public class Customer {


    @PostMapping("/create")
    public void createRequest(@RequestParam Long customerId){

    }
}
