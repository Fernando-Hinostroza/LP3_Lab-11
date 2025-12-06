package Ejercicio_2;
import java.util.ArrayList; 
import java.util.List; 
import java.util.Scanner; 

public class Main{ 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        CalculadoraDePrecios calculadora = new CalculadoraDePrecios(); 
        List<Producto> productos = new ArrayList<>(); 
        productos.add(new Producto("Laptop", 800, 2)); 
        productos.add(new Producto("Mouse", 25, 2)); 
        productos.add(new Producto("Teclado", 60, 2)); 
        System.out.println("=== CARRITO DE COMPRAS ==="); 
        for (Producto p : productos) { 
            System.out.println(p); 
        } 
        double subtotal = 0; 
        for (Producto p : productos) { 
            subtotal += p.getPrecio() * p.getCantidad(); 
        } 
        System.out.println("\nSubtotal: $" + subtotal); 
        int opcion; 
        while (true) { 
            System.out.println("\n=== SELECCIONA ESTRATEGIA DE DESCUENTO ==="); 
            System.out.println("1. Sin Descuento"); 
            System.out.println("2. Descuento Fijo (10%)"); 
            System.out.println("3. 30% por 2 productos iguales"); 
            System.out.println("4. 50% al producto más barato (3+ productos)"); 
            System.out.print("Opción: "); 
            opcion = scanner.nextInt(); 
            if (opcion >= 1 && opcion <= 4) { 
                break; 
            } else { 
                System.out.println("Opción inválida, intenta de nuevo.\n"); 
            } 
        } 
        switch (opcion) { 
            case 1 -> calculadora.setEstrategia(new SinDescuento()); 
            case 2 -> calculadora.setEstrategia(new DescuentoFijo()); 
            case 3 -> calculadora.setEstrategia(new DescuentoPorcentual());
            case 4 -> calculadora.setEstrategia(new DescuentoPorcentualAcumulado()); 
        } 
        double total = calculadora.calcular(productos); 
        System.out.println("\nTotal a pagar: $" + String.format("%.2f", total)); 
        scanner.close(); 
    } 
}
