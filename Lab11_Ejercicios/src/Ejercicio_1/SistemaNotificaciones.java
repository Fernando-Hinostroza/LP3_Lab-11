package Ejercicio_1;
import java.util.ArrayList;
import java.util.List;

public class SistemaNotificaciones {
    private List<Observer> suscriptores = new ArrayList<>();
    public void suscribir(Observer usuario) {
        if (!suscriptores.contains(usuario)) {
            suscriptores.add(usuario);
            System.out.println("Usuario suscrito.");
        }
    }
    public void desuscribir(Observer usuario) {
        suscriptores.remove(usuario);
        System.out.println("Usuario desuscrito.");
    }
    public void enviarNotificacion(Notificacion notificacion) {
        for (Observer obs : suscriptores) {
            obs.actualizar(notificacion.getMensaje());
        }
    }
}
