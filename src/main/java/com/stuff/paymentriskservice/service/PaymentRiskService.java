package com.stuff.paymentriskservice.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentRiskService {


    public String calculateRisk(double amount) {

        String risk = null;
        if (amount <= 1000)
            risk = "LOW";
        else
            if (amount > 1000 && amount <= 10000)
                risk = "MEDIUM";
            else
                risk = "HIGH";

        return risk;
    }
}
