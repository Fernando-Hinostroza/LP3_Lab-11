package Strategy;
import java.util.*; 

public class MainStrategy { 
	public static void main(String[] args) {
		CalculadoraPrecios calc = new CalculadoraPrecios(); 
		List<Producto> lista = Arrays.asList(
				new Producto("Laptop", 1200), 
				new Producto("Laptop", 1200) 
		); 
		calc.setEstrategia(new DescuentoPorcentual()); 
		System.out.println("Precio final: " + calc.calcular(lista)); 
	}
}
