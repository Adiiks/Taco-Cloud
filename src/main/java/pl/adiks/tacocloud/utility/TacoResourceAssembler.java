package pl.adiks.tacocloud.utility;

import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import pl.adiks.tacocloud.controller.api.DesignTacoController;
import pl.adiks.tacocloud.domain.Taco;

public class TacoResourceAssembler extends RepresentationModelAssemblerSupport<Taco, TacoResource> {

    public TacoResourceAssembler() {
        super(DesignTacoController.class, TacoResource.class);
    }

    @Override
    protected TacoResource instantiateModel(Taco entity) {
        return new TacoResource(entity);
    }

    @Override
    public TacoResource toModel(Taco entity) {
        return createModelWithId(entity.getId(), entity);
    }
}
