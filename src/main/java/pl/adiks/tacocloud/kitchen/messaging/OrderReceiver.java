package pl.adiks.tacocloud.kitchen.messaging;

import pl.adiks.tacocloud.domain.Order;

public interface OrderReceiver {

    Order receiveOrder();
}
