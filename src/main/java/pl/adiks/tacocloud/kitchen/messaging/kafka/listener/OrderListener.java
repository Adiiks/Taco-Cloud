package pl.adiks.tacocloud.kitchen.messaging.kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import pl.adiks.tacocloud.domain.Order;

@Component
public class OrderListener {

    @KafkaListener(topics = "tacocloud.orders.topic")
    public void handle(Order order) {
        System.out.println("Message received !!!");
    }
}
