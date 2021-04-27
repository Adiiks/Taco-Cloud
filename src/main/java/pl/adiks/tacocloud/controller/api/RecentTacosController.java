package pl.adiks.tacocloud.controller.api;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import pl.adiks.tacocloud.domain.Taco;
import pl.adiks.tacocloud.repository.TacoRepository;
import pl.adiks.tacocloud.utility.TacoResource;
import pl.adiks.tacocloud.utility.TacoResourceAssembler;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@RepositoryRestController
public class RecentTacosController {

    private final TacoRepository tacoRepository;

    public RecentTacosController(TacoRepository tacoRepository) {
        this.tacoRepository = tacoRepository;
    }

    @GetMapping(path = "/tacos/recent", produces = "application/hal+json")
    public ResponseEntity<CollectionModel<TacoResource>> recentTacos() {
        PageRequest pageRequest = PageRequest.of(0, 12, Sort.by("createdAt").descending());
        List<Taco> tacos = tacoRepository.findAll(pageRequest).getContent();

        CollectionModel<TacoResource> resources = new TacoResourceAssembler().toCollectionModel(tacos);
        resources.add(
                linkTo(methodOn(RecentTacosController.class).recentTacos())
                .withRel("recents"));
        return new ResponseEntity<>(resources, HttpStatus.OK);
    }
}
