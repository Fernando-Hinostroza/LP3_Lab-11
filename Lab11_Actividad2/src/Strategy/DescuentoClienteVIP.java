package Strategy;
import java.util.List;

public class DescuentoClienteVIP implements EstrategiaDescuento {
    public double calcularPrecioFinal(List<Producto> productos) {
        double total = productos.stream().mapToDouble(p -> p.precio).sum();
        return total * 0.60;
    }
}
