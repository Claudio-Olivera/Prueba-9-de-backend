package claudioServer.controller;


import claudioServer.model.Educacion;
import claudioServer.service.IEducacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class EducacionController {
    @Autowired
    private IEducacionService educacionService;

    @PostMapping("/new/educacion")
    public void agregarEducacion (@RequestBody Educacion exp) {
        educacionService.crearEducacion(exp);
    }

    @GetMapping("/ver/educacion")
    @ResponseBody
    public List<Educacion> verEducacion () {
        return educacionService.verEducacion();
    }

    @DeleteMapping ("/borrarEducacion/{id}")
    public void borrarEducacion(@PathVariable Long id){
        educacionService.borrarEducacion(id);
    }

}
