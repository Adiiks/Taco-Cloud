package pl.adiks.tacocloud.utility;

import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import pl.adiks.tacocloud.controller.api.IngredientController;
import pl.adiks.tacocloud.domain.Ingredient;

public class IngredientResourceAssembler extends RepresentationModelAssemblerSupport<Ingredient, IngredientResource> {

    public IngredientResourceAssembler() {
        super(IngredientController.class, IngredientResource.class);
    }

    @Override
    protected IngredientResource instantiateModel(Ingredient entity) {
        return new IngredientResource(entity);
    }

    @Override
    public IngredientResource toModel(Ingredient entity) {
        return createModelWithId(entity.getId(), entity);
    }
}
