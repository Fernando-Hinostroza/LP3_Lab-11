package Ejercicio_1;

public class Main {
    public static void main(String[] args) {
        SistemaNotificaciones sistema = new SistemaNotificaciones();
        Usuario user1 = new Usuario("Juan");
        Usuario user2 = new Usuario("María");
        Usuario user3 = new Usuario("Carlos");
        sistema.suscribir(user1);
        sistema.suscribir(user2);
        System.out.println("\n--- Enviando notificación ---");
        sistema.enviarNotificacion(new Notificacion("¡Nueva promoción del 50%!"));
        System.out.println("\n--- María se desuscribe ---");
        sistema.desuscribir(user2);
        System.out.println("\n--- Carlos se suscribe ---");
        sistema.suscribir(user3);
        System.out.println("\n--- Nueva notificación ---");
        sistema.enviarNotificacion(new Notificacion("Actualización de productos disponible."));
    }
}
