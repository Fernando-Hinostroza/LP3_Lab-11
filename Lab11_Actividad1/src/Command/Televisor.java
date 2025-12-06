package Command;

public class Televisor { 
	int volumen = 10; 
	int canal = 5;
	public void encender() { 
		System.out.println("TV encendida"); 
	} 
	public void apagar() { 
		System.out.println("TV apagada"); 
	}
	public void subirVolumen() { 
		volumen++; 
		System.out.println("Volumen: " + volumen); 
	}
	public void bajarVolumen() { 
		volumen--;
		System.out.println("Volumen: " + volumen); 
	}
	public void cambiarCanal(int nuevo) { 
		canal = nuevo; 
		System.out.println("Canal cambiado a: " + canal); 
	}
}
