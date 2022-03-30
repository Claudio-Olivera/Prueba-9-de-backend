package claudioServer.model;


import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
public class Acerca{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(unique = true)
    private String nombres;
    @NotNull
    @Column(unique = true)
    private String apellidos;
    @NotNull
    @Column(unique = true)
    private String ocupacion;
    @NotNull
    @Column(unique = true)
    private String sobremi;

    public Acerca() {
    }

    public Acerca(Long id, String nombres, String apellidos, String ocupacion, String sobremi) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.ocupacion = ocupacion;
        this.sobremi = sobremi;
    }

}





