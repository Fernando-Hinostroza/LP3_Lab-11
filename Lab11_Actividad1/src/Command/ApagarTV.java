package Command;

public class ApagarTV implements Comando { 
	Televisor tv; 
	public ApagarTV(Televisor tv) { 
		this.tv = tv; 
	} 
	public void ejecutar() { 
		tv.apagar(); 
	} 
}
