package biblioteca;

import biblioteca.libros.Libro;
import biblioteca.libros.GestorLibros;
import biblioteca.usuarios.Usuario;
import biblioteca.usuarios.GestorUsuarios;

public class Main {
    public static void main(String[] args) {
        // crear instancias de GestorLibros y GestorUsuarios
        GestorLibros gestorLibros = new GestorLibros();
        GestorUsuarios gestorUsuarios = new GestorUsuarios();

        // crear y agregar libros
        Libro libro1 = new Libro("El quijote","Miguel de Cervantes ",1605);
        Libro libro2 = new Libro("1984", "George Orwel", 1949);
        gestorLibros.agregarLibro(libro1);
        gestorLibros.agregarLibro(libro2);

        // crear y agregar usuarios
        Usuario usuario1 = new Usuario("Juan Perez","U001");
        Usuario usuario2 = new Usuario("Maria Gomez","U002");
        gestorUsuarios.agregarUsuario(usuario1);
        gestorUsuarios.agregarUsuario(usuario2);

        // Mostrar libros y usuarios
        System.out.println("Estos son los libros en la biblioteca:");
        for (Libro libro: gestorLibros.obtenerLibros()){
            System.out.println(libro.getTitulo() + " escrito por " + libro.getAutor());
        }

        System.out.println("\nUsuarios en la biblioteca: ");
        for (Usuario usuario: gestorUsuarios.obtenerUsuarios()){
            System.out.println((usuario.getNombre() + " ID " + usuario.getIdUsuario()));
        }

    }
}
