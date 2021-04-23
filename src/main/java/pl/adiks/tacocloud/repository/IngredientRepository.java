package pl.adiks.tacocloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.adiks.tacocloud.domain.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, String> {
}
