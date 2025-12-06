package Strategy;
import java.util.List; 

public class SinDescuento implements EstrategiaDescuento { 
	public double calcularPrecioFinal(List<Producto> productos) { 
		return productos.stream().mapToDouble(p -> p.precio).sum(); 
	}
}
