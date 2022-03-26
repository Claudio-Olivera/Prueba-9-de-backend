package claudioServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import claudioServer.model.Acerca;


import java.util.Optional;

@Repository
public interface AcercaRepository extends JpaRepository <Acerca, Integer > {
    Optional<Acerca> findByNombres(String nombres);
    boolean existsByNombres(String nombres);
    Optional<Acerca> findByApellidos(String apellidos);
    boolean existsByApellidos(String apellidos);
    Optional<Acerca> findByOcupacion(String ocupacion);
    boolean existsByOcupacion(String ocupacion);
    Optional<Acerca> findBySobremi(String sobremi);
    boolean existsBySobremi(String sobremi);

}
