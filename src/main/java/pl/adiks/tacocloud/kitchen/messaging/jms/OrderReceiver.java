package pl.adiks.tacocloud.kitchen.messaging.jms;

import pl.adiks.tacocloud.domain.Order;

public interface OrderReceiver {

    Order receiveOrder();
}
