package claudioServer.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nivelEducativo;
    private String titulo;
    private String institucion;


    public Educacion() {
    }

    public Educacion(Long id, String nivelEducativo, String titulo, String institucion) {
        this.id = id;
        this.nivelEducativo = nivelEducativo;
        this.titulo = titulo;
        this.institucion = institucion;
    }
}
