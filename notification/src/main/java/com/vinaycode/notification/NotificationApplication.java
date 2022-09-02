package com.vinaycode.notification;

import com.vinaycode.amqp.RabbitMQMessageProducer;
import lombok.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(
        scanBasePackages = {
                "com.vinaycode.notification",
                "com.vinaycode.amqp",
        }
)
public class NotificationApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class,args);
    }
/*    @Bean
    CommandLineRunner commandLineRunner(
            RabbitMQMessageProducer producer,
            NotificationConfig notificationConfig) {
        return args -> {
            producer.publish(new Person("Nikhil", 21),
                    notificationConfig.getInternalExchange(),
                    notificationConfig.getInternalNotificationRoutingKey());
        };
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    public class Person {
        String name;
        int age;
    }*/
}
