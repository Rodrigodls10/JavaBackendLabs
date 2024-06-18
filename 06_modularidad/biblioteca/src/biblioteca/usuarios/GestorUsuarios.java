package biblioteca.usuarios;
import java.util.ArrayList;
import java.util.List;


public class GestorUsuarios {
    private List<Usuario> usuarios;

    public GestorUsuarios() {
        this.usuarios = new ArrayList<>();
    }
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    public List<Usuario> obtenerUsuarios() {
        return usuarios;
    }

}


