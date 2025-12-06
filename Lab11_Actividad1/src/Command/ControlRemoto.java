package Command;

public class ControlRemoto { 
	private Comando comando; 
	public void setComando(Comando comando) { 
		this.comando = comando; 
	} 
	public void presionar() { 
		comando.ejecutar(); 
	}
}