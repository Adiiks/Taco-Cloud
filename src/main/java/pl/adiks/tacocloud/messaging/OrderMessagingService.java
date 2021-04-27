package pl.adiks.tacocloud.messaging;

import pl.adiks.tacocloud.domain.Order;

public interface OrderMessagingService {

    void sendOrder(Order order);
}
