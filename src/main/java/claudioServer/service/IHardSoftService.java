package claudioServer.service;

import claudioServer.model.HardSoft;

import java.util.List;

public interface IHardSoftService {
    List<HardSoft> verSkills();

    void crearSkills(HardSoft skl);

    void borrarSkills(Long id);

    HardSoft buscarSkills(Long id);
}
