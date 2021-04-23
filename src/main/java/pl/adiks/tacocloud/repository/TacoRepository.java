package pl.adiks.tacocloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.adiks.tacocloud.domain.Taco;

public interface TacoRepository extends JpaRepository<Taco, Long> {
}
