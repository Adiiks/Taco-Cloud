package pl.adiks.tacocloud.kitchen.messaging.rabbit.listener;

import org.springframework.stereotype.Component;
import pl.adiks.tacocloud.domain.Order;

//@Component
public class OrderListener {

    //@RabbitListener(queues = "tacocloud.order.queue")
    public void receiveOrder(Order order) {
        System.out.println("Message received !!!");
    }
}
