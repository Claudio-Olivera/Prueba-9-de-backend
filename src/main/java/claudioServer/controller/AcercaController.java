package claudioServer.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import claudioServer.DT.Mensaje;
import claudioServer.DT.AcercaDto;
import claudioServer.service.AcercaService;
import claudioServer.model.Acerca;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@RestController
@RequestMapping("persona")
@CrossOrigin
public class AcercaController {

    @Autowired
    AcercaService acercaService;

    @GetMapping("/alldata")
    public ResponseEntity<List<Acerca>> alldata(){
        List<Acerca> list = acercaService.findAll();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @PostMapping("/persona")
    public ResponseEntity<?> persona (@Valid @RequestBody AcercaDto acercaDto) {

        Acerca acerca = new Acerca(acercaDto.getNombres(),
                acercaDto.getApellidos(),
                acercaDto.getOcupacion(),
                acercaDto.getSobremi());


        acercaService.save(acerca);

        return new ResponseEntity(new Mensaje("La Persona fue guardada"), HttpStatus.CREATED);
    }

    @PostMapping("/new/data")
    public void save(@RequestBody Acerca acerca) {
        acercaService.save(acerca);
    }


    @PutMapping("/actualizar/{id}")
    public ResponseEntity<?> actualizar(@RequestBody @Valid AcercaDto acercaDto, @PathVariable("id") int id){

        Acerca acerca = acercaService.getOneById(id).get();
        acerca.setNombres(acercaDto.getNombres());
        acerca.setApellidos(acercaDto.getApellidos());
        acerca.setOcupacion(acercaDto.getOcupacion());
        acerca.setSobremi(acercaDto.getSobremi());
        acercaService.save(acerca);
        return new ResponseEntity(new Mensaje("La Persona fue actualizada"), HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Acerca> getOne(@PathVariable("id") int id){
        if(!acercaService.existsById(id))
            return new ResponseEntity(new Mensaje("Esta persona no existe"), HttpStatus.NOT_FOUND);
        Acerca acerca = acercaService.getOneById(id).get();
        return new ResponseEntity(acerca, HttpStatus.OK);
    }

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> borrar(@PathVariable("id") int id){
        if(!acercaService.existsById(id))
            return new ResponseEntity(new Mensaje("Esta persona no existe"), HttpStatus.NOT_FOUND);
        acercaService.delete(id);
        return new ResponseEntity(new Mensaje("La persona fue eliminada"), HttpStatus.OK);
    }





}
