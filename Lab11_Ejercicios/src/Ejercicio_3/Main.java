package Ejercicio_3;

public class Main {
    public static void main(String[] args) {
        // Dispositivos
        Luz luz = new Luz();
        Ventilador ventilador = new Ventilador();
        AireAcondicionado aire = new AireAcondicionado();
        // Comandos
        Command encenderLuz = new EncenderLuz(luz);
        Command apagarLuz = new ApagarLuz(luz);
        Command encenderVent = new EncenderVentilador(ventilador);
        Command apagarVent = new ApagarVentilador(ventilador);
        Command encenderAire = new EncenderAire(aire);
        Command apagarAire = new ApagarAire(aire);
        // Control remoto
        ControlRemoto control = new ControlRemoto();
        // Asignación dinámica de comandos
        control.setComando("luz_on", encenderLuz);
        control.setComando("luz_off", apagarLuz);
        control.setComando("vent_on", encenderVent);
        control.setComando("vent_off", apagarVent);
        control.setComando("aire_on", encenderAire);
        control.setComando("aire_off", apagarAire);
        // Ejecuciones
        control.presionarBoton("luz_on");
        control.presionarBoton("vent_on");
        control.presionarBoton("aire_off");
        // Deshacer última acción
        control.deshacer();
        // Más acciones
        control.presionarBoton("vent_off");
        control.deshacer();
    }
}
