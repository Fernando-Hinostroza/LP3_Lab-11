package Ejercicio_1;

public class Usuario implements Observer {
    private String nombre;
    public Usuario(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void actualizar(String mensaje) {
        System.out.println("[" + nombre + "] Notificación: " + mensaje);
    }
    public String getNombre() {
        return nombre;
    }
}

