package pl.adiks.tacocloud.utility;

import lombok.Getter;
import org.springframework.hateoas.RepresentationModel;
import pl.adiks.tacocloud.domain.Ingredient;

import static pl.adiks.tacocloud.domain.Ingredient.*;

@Getter
public class IngredientResource extends RepresentationModel<IngredientResource> {

    private String name;
    private Type type;

    public IngredientResource(Ingredient ingredient) {
        this.name = ingredient.getName();
        this.type = ingredient.getType();
    }
}
