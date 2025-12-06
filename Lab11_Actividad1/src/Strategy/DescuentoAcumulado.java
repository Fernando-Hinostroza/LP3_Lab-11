package Strategy;
import java.util.List; 

public class DescuentoAcumulado implements EstrategiaDescuento { 
	public double calcularPrecioFinal(List<Producto> productos) { 
		if (productos.size() >= 3) {	
			double menor = productos.stream() 
					.mapToDouble(p -> p.precio) 
					.min() 
					.getAsDouble(); 
			double total = productos.stream().mapToDouble(p -> p.precio).sum(); 
			return total - (menor * 0.5); 
		} 
		return productos.stream().mapToDouble(p -> p.precio).sum(); 
	}
}
