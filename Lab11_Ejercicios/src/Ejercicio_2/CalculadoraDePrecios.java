package Ejercicio_2;
import java.util.List;

public class CalculadoraDePrecios {
    private EstrategiaDescuento estrategia;
    public void setEstrategia(EstrategiaDescuento estrategia) {
        this.estrategia = estrategia;
    }
    public double calcular(List<Producto> productos) {
        if (estrategia == null) {
            throw new IllegalStateException("No se ha establecido una estrategia");
        }
        return estrategia.calcularPrecioFinal(productos);
    }
}
