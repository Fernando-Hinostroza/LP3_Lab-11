package Main;
import Observer.*;
import Strategy.*;
import Command.*;
import java.util.*;

public class MainSistemaIntegrado {
    public static void main(String[] args) {
        Notificador notificador = new Notificador();
        Usuario u1 = new Usuario("Ana");
        Usuario u2 = new Usuario("Luis");
        //Observer
        notificador.suscribir(u1);
        notificador.suscribir(u2);
        // Strategy
        CalculadoraPrecios calc = new CalculadoraPrecios();
        calc.setEstrategia(new DescuentoNavidad());
        List<Producto> carrito = Arrays.asList(
            new Producto("Laptop", 2500),
            new Producto("Mouse", 50)
        );
        //Command
        Comando activar = new ActivarDescuento(calc, new DescuentoClienteVIP());
        activar.ejecutar();
        notificador.notificar("Descuento VIP activado");
        System.out.println("Precio final: S/ " + calc.calcular(carrito));
    }
}
