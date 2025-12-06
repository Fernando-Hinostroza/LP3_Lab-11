package Command;
import Strategy.*;

public class ActivarDescuento implements Comando {
    private CalculadoraPrecios calc;
    private EstrategiaDescuento estrategia;
    public ActivarDescuento(CalculadoraPrecios calc, EstrategiaDescuento estrategia) {
        this.calc = calc;
        this.estrategia = estrategia;
    }
    public void ejecutar() {
        calc.setEstrategia(estrategia);
        System.out.println("Descuento aplicado: " + estrategia.getClass().getSimpleName());
    }
}
