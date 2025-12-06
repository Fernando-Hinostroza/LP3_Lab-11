package Observer;

public class Usuario implements UsuarioObserver {
    private String nombre;
    public Usuario(String nombre) {
        this.nombre = nombre;
    }
    public void recibir(String mensaje) {
        System.out.println(nombre + " recibió: " + mensaje);
    }
}
