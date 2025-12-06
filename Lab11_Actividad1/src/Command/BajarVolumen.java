package Command;

public class BajarVolumen implements Comando { 
	Televisor tv; 
	public BajarVolumen(Televisor tv) { 
		this.tv = tv; 
	} 
	public void ejecutar() { 
		tv.bajarVolumen(); 
	} 
}