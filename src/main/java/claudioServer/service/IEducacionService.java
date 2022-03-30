package claudioServer.service;

import claudioServer.model.Educacion;
import claudioServer.model.HardSoft;

import java.util.List;

public interface IEducacionService {
   List<Educacion> verEducacion();
    void crearEducacion(Educacion edu);
    void borrarEducacion(Long id);
    Educacion buscarEducacion(Long id);
    //VER EL DE EXPERIENCIA PARA HACER EL BUSCAR
}
