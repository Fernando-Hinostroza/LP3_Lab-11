package Strategy;
import java.util.List; 

public class DescuentoPorcentual implements EstrategiaDescuento { 
	public double calcularPrecioFinal(List<Producto> productos) { 
		if (productos.size() == 2 && productos.get(0).nombre.equals(productos.get(1).nombre)) { 
			return (productos.get(0).precio + productos.get(1).precio) * 0.7; 
		} 
		return productos.stream().mapToDouble(p -> p.precio).sum(); 
	}
}