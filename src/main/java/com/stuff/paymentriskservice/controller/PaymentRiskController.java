package com.stuff.paymentriskservice.controller;

import com.stuff.paymentriskservice.model.Payment;
import com.stuff.paymentriskservice.service.PaymentRiskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentRiskController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PaymentRiskController.class);
    @Autowired
    PaymentRiskService paymentRiskService;

    @PostMapping("/risk")
    public Payment calculatePaymentRisk(@RequestBody Payment payment){
        LOGGER.info("POST /risk");
        String risk = paymentRiskService.calculateRisk();
        payment.setRisk(risk);
        return payment;
    }
}
