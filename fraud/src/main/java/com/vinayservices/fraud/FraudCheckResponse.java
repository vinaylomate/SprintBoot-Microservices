package com.vinayservices.fraud;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class FraudCheckResponse {
    boolean isFraudster;

    public boolean isFraudster() {
        return isFraudster;
    }
}
