package kvp.hhlin.minifullfillment.controller;

import kvp.hhlin.minifullfillment.domain.Center;
import kvp.hhlin.minifullfillment.dto.CenterCreateRequest;
import kvp.hhlin.minifullfillment.repository.CenterRepository;
import kvp.hhlin.minifullfillment.service.CenterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/centers")
@RestController
public class CenterController {

    private final CenterService centerService;
    private final CenterRepository centerRepository;

    public CenterController(CenterService centerService, CenterRepository centerRepository) {
        this.centerService = centerService;
        this.centerRepository = centerRepository;
    }

    @PostMapping
    public void save(@RequestBody CenterCreateRequest centerCreateRequest) {
        centerService.save(centerCreateRequest.getName());
    }

    @GetMapping
    public List<Center> findAll() {
        return centerRepository.findAll();
    }
}
