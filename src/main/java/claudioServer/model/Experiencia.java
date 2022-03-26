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
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String empleoUno;
    private String descripcionUno;
    private String empleoDos;
    private String descripcionDos;
    private String empleoTres;
    private String descripcionTres;

    public Experiencia() {
    }

    public Experiencia(Long id, String empleoUno, String descripcionUno, String empleoDos, String descripcionDos, String empleoTres, String descripcionTres) {
        this.id = id;
        this.empleoUno = empleoUno;
        this.descripcionUno = descripcionUno;
        this.empleoDos = empleoDos;
        this.descripcionDos = descripcionDos;
        this.empleoTres = empleoTres;
        this.descripcionTres = descripcionTres;
    }
}
