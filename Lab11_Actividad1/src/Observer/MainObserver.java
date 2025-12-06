package Observer;

public class MainObserver { 
	public static void main(String[] args) { 
		Notificador notificador = new Notificador(); 
		Usuario u1 = new Usuario("Juan"); 
		Usuario u2 = new Usuario("María"); 
		Usuario u3 = new Usuario("Luis"); 
		notificador.suscribir(u1); 
		notificador.suscribir(u2); 
		notificador.notificar("Nueva promoción disponible!"); 
		notificador.suscribir(u3); 
		notificador.notificar("Producto actualizado!"); 
		notificador.desuscribir(u1); 
		notificador.notificar("Oferta exclusiva!"); 
	} 
}
