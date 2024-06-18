package biblioteca.libros;


import java.util.ArrayList;
import java.util.List;


public class GestorLibros {
    private List<Libro> libros;

    public GestorLibros() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro){
        libros.add(libro);
    }
    public List<Libro> obtenerLibros() {
        return libros;
    }

}
