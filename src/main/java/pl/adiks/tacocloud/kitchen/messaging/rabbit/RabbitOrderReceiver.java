package pl.adiks.tacocloud.kitchen.messaging.rabbit;

import org.springframework.stereotype.Component;
import pl.adiks.tacocloud.domain.Order;

@Component
public class RabbitOrderReceiver {

    /*private final RabbitTemplate rabbitTemplate;

    public RabbitOrderReceiver(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public Order receiveOrder() {
        return (Order) rabbitTemplate.receiveAndConvert("tacocloud.order.queue");
    } */
}
