package Ejercicio_2;
import java.util.List;

public class DescuentoFijo implements EstrategiaDescuento {
    @Override
    public double calcularPrecioFinal(List<Producto> productos) {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio() * p.getCantidad();
        }
        return total - (total * 0.10);
    }
}
