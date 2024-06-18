package biblioteca.libros;

//esta clase es una plantilla que define comportamientos y propiedades de los objetos que se van a crear a partir de ella

public class Libro {
    // variables de instancia son los atributos o porpiedades
    private String titulo;
    private String autor;
    private int anioPublicacion;

    // metodo constructor
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
}
