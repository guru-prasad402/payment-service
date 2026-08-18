package com.microservices.payment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @GetMapping("/api/payments/{orderId}")
    public String getPayment(@PathVariable Long orderId) throws InterruptedException {

        Thread.sleep(5000);

        return "Payment successful for Order ID: " + orderId;
    }
}