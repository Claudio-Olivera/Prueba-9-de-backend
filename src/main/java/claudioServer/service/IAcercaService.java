package claudioServer.service;

import claudioServer.model.Acerca;
import claudioServer.model.HardSoft;

import java.util.List;


public interface IAcercaService {
    List<Acerca> verAcerca();
    void crearAcerca(Acerca acerca);
    void borrarAcerca(Long id);

   Acerca buscarAcerca(Long id);

    void save(Acerca acerca);
    //VER EL DE EXPERIENCIA PARA HACER EL BUSCAR
}
