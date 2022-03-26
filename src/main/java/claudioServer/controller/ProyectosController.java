package claudioServer.controller;



import claudioServer.model.Proyectos;


import claudioServer.service.IProyectosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProyectosController {

    @Autowired
    private IProyectosService ProyectosService;

    @PostMapping("/new/Proyectos")
    public void agregarProyectos (@RequestBody Proyectos pro) {
        ProyectosService.crearProyectos(pro);
    }

    @GetMapping("/ver/Proyectos")
    @ResponseBody
    public List<Proyectos> verProyectos () {
        return ProyectosService.verProyectos();
    }

    @DeleteMapping ("/borrarProyectos/{id}")
    public void borrarProyectos(@PathVariable Long id){
        ProyectosService.borrarProyectos(id);
    }
}
