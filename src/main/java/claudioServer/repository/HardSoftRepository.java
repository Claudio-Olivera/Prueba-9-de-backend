package claudioServer.repository;

import claudioServer.model.HardSoft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HardSoftRepository extends JpaRepository<HardSoft, Long> {

}
