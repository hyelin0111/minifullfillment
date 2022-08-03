package kvp.hhlin.minifullfillment.service;

import kvp.hhlin.minifullfillment.domain.Center;
import kvp.hhlin.minifullfillment.repository.CenterRepository;
import org.springframework.stereotype.Service;

@Service
public class CenterService {

    private final CenterRepository centerRepository;

    public CenterService(CenterRepository centerRepository) {
        this.centerRepository = centerRepository;
    }

    public void save(String name) {
        centerRepository.save(Center.of(name));
    }
}
