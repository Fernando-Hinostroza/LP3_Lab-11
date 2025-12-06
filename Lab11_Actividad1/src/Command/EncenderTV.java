package Command;

public class EncenderTV implements Comando { 
	Televisor tv;
	public EncenderTV(Televisor tv) { 
		this.tv = tv; 
	}
	public void ejecutar() { 
		tv.encender(); 
	}
}
