package kvp.hhlin.minifullfillment.repository;

import kvp.hhlin.minifullfillment.domain.Center;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CenterRepository extends JpaRepository<Center, Long> {
}
