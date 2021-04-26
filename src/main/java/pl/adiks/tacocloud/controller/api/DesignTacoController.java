package pl.adiks.tacocloud.controller.api;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.adiks.tacocloud.domain.Taco;
import pl.adiks.tacocloud.repository.TacoRepository;
import pl.adiks.tacocloud.utility.TacoResource;
import pl.adiks.tacocloud.utility.TacoResourceAssembler;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@RestController("api")
@RequestMapping(path = "/design", produces = "application/json")
@CrossOrigin(origins = "*")
public class DesignTacoController {

    private final TacoRepository tacoRepository;

    public DesignTacoController(TacoRepository tacoRepository) {
        this.tacoRepository = tacoRepository;
    }

    @GetMapping("/recent")
    public CollectionModel<TacoResource> recentTacos() {
        PageRequest page = PageRequest.of(0, 12, Sort.by("createdAt").descending());

        List<Taco> tacos = tacoRepository.findAll(page).getContent();

        CollectionModel<TacoResource> tacoResources = new TacoResourceAssembler().toCollectionModel(tacos);
        tacoResources.add(
                linkTo(methodOn(DesignTacoController.class).recentTacos())
                .withRel("recents")
        );

        return tacoResources;
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Taco postTaco(@RequestBody Taco taco) {
        return tacoRepository.save(taco);
    }
}
