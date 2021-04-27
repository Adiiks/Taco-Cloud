package pl.adiks.tacocloud.kitchen.messaging.jms.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import pl.adiks.tacocloud.domain.Order;

@Component
public class OrderListener {

    @JmsListener(destination = "tacocloud.order.queue")
    public void receiveOrder(Order order) {
        System.out.println("\nReceived order !!!");
    }
}
