package claudioServer.controller;

import claudioServer.service.IAcercaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import claudioServer.model.Acerca;
import javax.validation.Valid;
import java.util.List;


@RestController
public class AcercaController {
    @Autowired
    private IAcercaService acercaService;

    @PostMapping("/new/persona")
    public void agregarPersona (@RequestBody Acerca acerca) {
        acercaService.crearAcerca(acerca);
    }

    @GetMapping("/ver/persona")
    @ResponseBody
    public List<Acerca> verAcerca () {
        return acercaService.verAcerca();
    }

    @DeleteMapping ("/borrarPersona/{id}")
    public void borrarAcerca(@PathVariable Long id){
        acercaService.borrarAcerca(id);
    }


    @PutMapping("/actualizar/{id}")
    public List<Acerca>actualizarAcerca(@PathVariable Long id , @RequestBody @Valid Acerca acerca){
        Acerca s= acercaService.buscarAcerca(id);
        s.setNombres(acerca.getNombres());
        s.setApellidos(acerca.getApellidos());
        s.setOcupacion(acerca.getOcupacion());
        s.setSobremi(acerca.getSobremi());

        acercaService.save(acerca);

        return null;
    }

}
