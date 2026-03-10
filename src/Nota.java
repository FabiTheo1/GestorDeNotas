import java.io.Serializable;
import java.util.UUID;

public class Nota implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String titulo;
    private String contenido;

    public Nota(String titulo, String contenido) {
        this.id = UUID.randomUUID().toString(); //Esta parte genera un id único para cada nota.
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    //Este método muestra la lista Jlist de la interfaz.
    @Override
    public String toString(){
        return titulo;
    }

}