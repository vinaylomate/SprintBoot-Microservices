package com.vinaycode.clients.fraud;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class FraudCheckResponse {
    boolean isFraudster;

    public boolean isFraudster() {
        return isFraudster;
    }
}
