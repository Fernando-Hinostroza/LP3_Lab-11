package Strategy;
import java.util.List; 

public class DescuentoFijo implements EstrategiaDescuento { 
	public double calcularPrecioFinal(List<Producto> productos) { 
		double total = productos.stream().mapToDouble(p -> p.precio).sum(); 
		return total * 0.90; 
	}
}