package pl.adiks.tacocloud.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.adiks.tacocloud.domain.Order;
import pl.adiks.tacocloud.messaging.OrderMessagingService;

@RestController("order-api")
@RequestMapping("/order")
public class OrderController {

    private final OrderMessagingService orderMessaging;

    public OrderController(OrderMessagingService orderMessaging) {
        this.orderMessaging = orderMessaging;
    }

    @GetMapping("/send-message")
    public String sendMessage() {
        orderMessaging.sendOrder(new Order());
        return "Order was send successfully";
    }
}
