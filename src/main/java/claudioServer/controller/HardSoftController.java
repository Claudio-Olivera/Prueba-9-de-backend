package claudioServer.controller;



import claudioServer.model.HardSoft;

import claudioServer.service.IHardSoftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HardSoftController {

    @Autowired
    private IHardSoftService HardSoftService;

    @PostMapping("/new/Skills")
    public void agregarSkills (@RequestBody HardSoft skl) {
        HardSoftService.crearSkills(skl);
    }

    @GetMapping("/ver/Skills")
    @ResponseBody
    public List<HardSoft> verSkills () {
        return HardSoftService.verSkills();
    }

    @DeleteMapping ("/borrarSkills/{id}")
    public void borrarSkills(@PathVariable Long id){
        HardSoftService.borrarSkills(id);
    }

}
