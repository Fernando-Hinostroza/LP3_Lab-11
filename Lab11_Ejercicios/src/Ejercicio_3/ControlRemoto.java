package Ejercicio_3;
import java.util.HashMap;
import java.util.Map;

public class ControlRemoto {
    private Map<String, Command> comandos = new HashMap<>();
    private Command ultimoComando;
    public void setComando(String nombre, Command comando) {
        comandos.put(nombre, comando);
    }
    public void presionarBoton(String nombre) {
        Command comando = comandos.get(nombre);  
        if (comando != null) {
            comando.ejecutar();
            ultimoComando = comando;
        } else {
            System.out.println("No hay comando asignado a ese botón.");
        }
    }
    public void deshacer() {
        if (ultimoComando != null) {
            System.out.println("Deshaciendo última acción...");
            ultimoComando.deshacer();
        } 
        else {
            System.out.println("No hay acción para deshacer.");
        }
    }
}

