package claudioServer.service;


import claudioServer.model.HardSoft;

import claudioServer.repository.HardSoftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HardSoftService implements IHardSoftService {
    @Autowired
    public HardSoftRepository skillsRepo;

    @Override
    public List<HardSoft> verSkills() {
        return skillsRepo.findAll();
    }

    @Override
    public void crearSkills(HardSoft skl) {
        skillsRepo.save(skl);
    }

    @Override
    public void borrarSkills(Long id) {
        skillsRepo.deleteById(id);
    }

    @Override
    public HardSoft buscarSkills(Long id) {
        return skillsRepo.findById(id).orElse(null);
    }
}
