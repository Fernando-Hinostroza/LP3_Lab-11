package Command;

public class MainCommand { 
	public static void main(String[] args) { 
		Televisor tv = new Televisor(); 
		ControlRemoto control = new ControlRemoto(); 
		control.setComando(new EncenderTV(tv)); 
		control.presionar(); 
		control.setComando(new SubirVolumen(tv)); 
		control.presionar(); 
		control.setComando(new CambiarCanal(tv, 12)); 
		control.presionar(); 
		control.setComando(new ApagarTV(tv)); 
		control.presionar(); 
	}
}
