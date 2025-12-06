package Observer;
import java.util.ArrayList;
import java.util.List;

public class Notificador {
    private List<UsuarioObserver> usuarios = new ArrayList<>();
    public void suscribir(UsuarioObserver u) {
        usuarios.add(u);
    }
    public void notificar(String mensaje) {
        for (UsuarioObserver u : usuarios) {
            u.recibir(mensaje);
        }
    }
}
