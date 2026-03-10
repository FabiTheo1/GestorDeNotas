import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nombreUsuario;
    private String hashContrasena;
    private List<Nota> notas;

    public Usuario(String nombreUsuario, String hashContrasena) {
        this.nombreUsuario = nombreUsuario;
        this.hashContrasena = hashContrasena;
        this.notas = new ArrayList<>();
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getHashContrasena() {
        return hashContrasena;
    }

    public List<Nota> getNotas() {
        return notas;
    }

}
