package pl.adiks.tacocloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.adiks.tacocloud.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
