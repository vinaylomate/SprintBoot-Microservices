package com.vinaycode.clients.notification;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NotificationRequest {
    Integer toCustomerId;
    String toCustomerName;
    String message;
    public Integer toCustomerId() {
        return toCustomerId;
    }
    public String toCustomerName() {
        return toCustomerName;
    }
    public String message() {
        return message;
    }
}
