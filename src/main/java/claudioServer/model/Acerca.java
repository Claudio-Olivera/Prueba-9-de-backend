package claudioServer.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Acerca{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
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

    public Acerca(String nombres, String apellidos, String ocupacion, String sobremi) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.ocupacion = ocupacion;
        this.sobremi = sobremi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getSobremi() {
        return sobremi;
    }

    public void setSobremi(String sobremi) {
        this.sobremi = sobremi;
    }
}





