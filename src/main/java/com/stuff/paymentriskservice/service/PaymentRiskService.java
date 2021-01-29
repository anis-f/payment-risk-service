package com.stuff.paymentriskservice.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentRiskService {

    private static int TOTAL_COUNT = 0;
    private static int ACCEPTED_COUNT = 0;

    public synchronized String calculateRisk() {
        String risk = null;
        double acceptedPaymentThreshold = TOTAL_COUNT * 0.7;

        if (ACCEPTED_COUNT <= acceptedPaymentThreshold) {
            risk = "ACCEPTED";
            ACCEPTED_COUNT++;
        }
        else
            risk = "REJECTED";
        TOTAL_COUNT++;
        return risk;
    }
}
