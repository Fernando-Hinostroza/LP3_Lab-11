package Ejercicio_2;
import java.util.List;

public class DescuentoPorcentual implements EstrategiaDescuento {
    @Override
    public double calcularPrecioFinal(List<Producto> productos) {
        double total = 0;
        boolean hayProductosIguales = false;
        for (Producto p : productos) {
            total += p.getPrecio() * p.getCantidad();
            if (p.getCantidad() >= 2) {
                hayProductosIguales = true;
            }
        }
        if (hayProductosIguales) {
            return total - (total * 0.30);
        }
        return total;
    }
}

