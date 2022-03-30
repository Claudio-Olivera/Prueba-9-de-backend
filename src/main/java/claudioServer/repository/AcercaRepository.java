package claudioServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import claudioServer.model.Acerca;


@Repository
public interface AcercaRepository extends JpaRepository <Acerca, Long > {

}
