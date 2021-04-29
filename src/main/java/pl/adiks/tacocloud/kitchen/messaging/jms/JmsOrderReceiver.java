package pl.adiks.tacocloud.kitchen.messaging.jms;

import org.springframework.stereotype.Component;
import pl.adiks.tacocloud.domain.Order;
import pl.adiks.tacocloud.kitchen.messaging.OrderReceiver;

@Component
public class JmsOrderReceiver implements OrderReceiver {

    /*
    private final JmsTemplate jmsTemplate;

    public JmsOrderReceiver(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }
     */

    @Override
    public Order receiveOrder() {
        return null; //(Order) jmsTemplate.receiveAndConvert("tacocloud.order.queue");
    }
}
