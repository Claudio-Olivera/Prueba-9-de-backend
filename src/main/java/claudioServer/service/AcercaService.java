package claudioServer.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import claudioServer.repository.AcercaRepository;
import claudioServer.model.Acerca;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@Transactional

public class AcercaService {

    @Autowired
    AcercaRepository acercaRepository;

    @Transactional(readOnly = true)

    public List<Acerca> findAll() {
        return acercaRepository.findAll();
    }


    @Transactional(readOnly = true)
    public Optional<Acerca> getOneByNombres(String nombres){
        return acercaRepository.findByNombres(nombres);
    }
    @Transactional(readOnly = true)
    public Optional<Acerca> getOneByApellidos(String apellidos){
        return acercaRepository.findByApellidos(apellidos);
    }
    @Transactional(readOnly = true)

    public Optional<Acerca> getOneByOcupacion(String ocupacion){
        return acercaRepository.findByOcupacion(ocupacion);
    }

    @Transactional(readOnly = true)
    public Optional<Acerca> getOneBySobremi(String sobremi){
        return acercaRepository.findBySobremi(sobremi);
    }

    @Transactional(readOnly = true)
    public Optional<Acerca> getOneById(int id){return acercaRepository.findById(id);
    }





    public void save(Acerca acerca){acercaRepository.save(acerca);
    }

    public void delete(int id){acercaRepository.deleteById(id);
    }

    public boolean existsById(int id){return acercaRepository.existsById(id);
    }

}
