package Ejercicio_2;
import java.util.List;

public class DescuentoPorcentualAcumulado implements EstrategiaDescuento {
    @Override
    public double calcularPrecioFinal(List<Producto> productos) {
        double total = 0;
        double precioMinimo = Double.MAX_VALUE;
        for (Producto p : productos) {
            total += p.getPrecio() * p.getCantidad();
            if (p.getPrecio() < precioMinimo) {
                precioMinimo = p.getPrecio();
            }
        }
        if (productos.size() >= 3) {
            return total - (precioMinimo * 0.50);
        }
        return total;
    }
}
