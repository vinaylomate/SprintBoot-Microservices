package com.vinayservices.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FraudCheckResponse {
    boolean isFraudster;
    public boolean isFraudster() {

        return isFraudster;
    }
}
