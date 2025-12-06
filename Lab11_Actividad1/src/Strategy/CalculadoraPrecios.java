package Strategy;
import java.util.List; 

public class CalculadoraPrecios { 
	private EstrategiaDescuento estrategia; 
	public void setEstrategia(EstrategiaDescuento estrategia) { 
		this.estrategia = estrategia; 
	} 
	public double calcular(List<Producto> productos) { 
		return estrategia.calcularPrecioFinal(productos); 
	}
}