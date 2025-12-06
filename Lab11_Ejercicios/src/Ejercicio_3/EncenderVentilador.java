package Ejercicio_3;

public class EncenderVentilador implements Command {
    private Ventilador ventilador;
    public EncenderVentilador(Ventilador ventilador) {
        this.ventilador = ventilador;
    }
    @Override
    public void ejecutar() {
        ventilador.encender();
    }
    @Override
    public void deshacer() {
        ventilador.apagar();
    }
}
