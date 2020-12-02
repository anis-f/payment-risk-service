package com.stuff.paymentriskservice.web;

import com.stuff.paymentriskservice.domain.Payment;
import com.stuff.paymentriskservice.service.PaymentRiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentRiskController {

    @Autowired
    PaymentRiskService paymentRiskService;

    @PostMapping("/risk")
    public Payment calculatePaymentRisk(@RequestBody Payment payment){
        String risk = paymentRiskService.calculateRisk(payment.getAmount());
        payment.setRisk(risk);
        return payment;
    }
}
