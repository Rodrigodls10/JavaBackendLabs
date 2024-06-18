package biblioteca.usuarios;

public class Usuario {
    private String nombre;
    private String IdUsuario;

    public Usuario(String nombre, String IdUsuario) {
        this.nombre = nombre;
        this.IdUsuario = IdUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdUsuario() {
        return IdUsuario;
    }
}
