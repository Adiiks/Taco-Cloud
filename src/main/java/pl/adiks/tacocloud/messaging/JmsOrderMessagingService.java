package pl.adiks.tacocloud.messaging;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import pl.adiks.tacocloud.domain.Order;

@Service
public class JmsOrderMessagingService implements OrderMessagingService {

    private final JmsTemplate jmsTemplate;

    public JmsOrderMessagingService(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @Override
    public void sendOrder(Order order) {
        jmsTemplate.convertAndSend("tacocloud.order.queue", order);
    }
}
