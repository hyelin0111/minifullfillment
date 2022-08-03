package kvp.hhlin.minifullfillment.repository;

import kvp.hhlin.minifullfillment.domain.Barcode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarcodeRepository extends JpaRepository<Barcode, Long> {

}