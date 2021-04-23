package pl.adiks.tacocloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.adiks.tacocloud.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
}
