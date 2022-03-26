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
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String proNombreUno;
    private String proFechaUno;
    private String proLinkUno;
    private String proImgUno;
    private String proyectoDescripcionUno;

    private String proNombreDos;
    private String proFechaDos;
    private String proLinkDos;
    private String proImgDos;
    private String proyectoDescripcionDos;

    private String proNombreTres;
    private String proFechaTres;
    private String proLinkTres;
    private String proImgTres;
    private String proyectoDescripcionTres;


    public Proyectos() {
    }

    public Proyectos(Long id, String proNombreUno, String proFechaUno, String proLinkUno, String proImgUno, String proyectoDescripcionUno, String proNombreDos, String proFechaDos, String proLinkDos, String proImgDos, String proyectoDescripcionDos, String proNombreTres, String proFechaTres, String proLinkTres, String proImgTres, String proyectoDescripcionTres) {
        this.id = id;
        this.proNombreUno = proNombreUno;
        this.proFechaUno = proFechaUno;
        this.proLinkUno = proLinkUno;
        this.proImgUno = proImgUno;
        this.proyectoDescripcionUno = proyectoDescripcionUno;
        this.proNombreDos = proNombreDos;
        this.proFechaDos = proFechaDos;
        this.proLinkDos = proLinkDos;
        this.proImgDos = proImgDos;
        this.proyectoDescripcionDos = proyectoDescripcionDos;
        this.proNombreTres = proNombreTres;
        this.proFechaTres = proFechaTres;
        this.proLinkTres = proLinkTres;
        this.proImgTres = proImgTres;
        this.proyectoDescripcionTres = proyectoDescripcionTres;
    }
}
