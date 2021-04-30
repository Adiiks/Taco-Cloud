package pl.adiks.tacocloud.messaging;

import org.springframework.stereotype.Service;
import pl.adiks.tacocloud.domain.Order;

@Service
public class RabbitOrderMessagingService {

    /*
    private final RabbitTemplate rabbitTemplate;

    public RabbitOrderMessagingService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void sendOrder(Order order) {
        rabbitTemplate.convertAndSend("tacocloud.order", order);
    }

     */
}
