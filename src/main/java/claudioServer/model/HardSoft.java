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
public class HardSoft {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int primercirculo;
    private int segundocirculo;
    private int tercercirculo;
    private int cuartocirculo;

    private String softTituloUno;
    private String softDescripcion;

    private String softTituloDos;
    private String sofDescripcionDos;

    private String softTituloTres;
    private String sofDescripcionTres;

    private String softTituloCuatro;
    private String sofDescripcionCuatro;


    public HardSoft() {
    }

    public HardSoft(Long id, int primercirculo, int segundocirculo, int tercercirculo, int cuartocirculo, String softTituloUno, String softDescripcion, String softTituloDos, String sofDescripcionDos, String softTituloTres, String sofDescripcionTres, String softTituloCuatro, String sofDescripcionCuatro) {
        this.id = id;
        this.primercirculo = primercirculo;
        this.segundocirculo = segundocirculo;
        this.tercercirculo = tercercirculo;
        this.cuartocirculo = cuartocirculo;
        this.softTituloUno = softTituloUno;
        this.softDescripcion = softDescripcion;
        this.softTituloDos = softTituloDos;
        this.sofDescripcionDos = sofDescripcionDos;
        this.softTituloTres = softTituloTres;
        this.sofDescripcionTres = sofDescripcionTres;
        this.softTituloCuatro = softTituloCuatro;
        this.sofDescripcionCuatro = sofDescripcionCuatro;
    }

}
