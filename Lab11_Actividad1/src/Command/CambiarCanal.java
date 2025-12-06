package Command;

public class CambiarCanal implements Comando { 
	Televisor tv; 
	int canal; 
	public CambiarCanal(Televisor tv, int canal) { 
		this.tv = tv; this.canal = canal; 
	} 
	public void ejecutar() { 
		tv.cambiarCanal(canal); 
	} 
}
