package Command;

public class SubirVolumen implements Comando { 
	Televisor tv; 
	public SubirVolumen(Televisor tv) { 
		this.tv = tv; 
	} 
	public void ejecutar() { 
		tv.subirVolumen(); 
	} 
}
