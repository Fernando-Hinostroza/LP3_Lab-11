package Ejercicio_3;

public class ApagarVentilador implements Command {
    private Ventilador ventilador;
    public ApagarVentilador(Ventilador ventilador) {
        this.ventilador = ventilador;
    }
    @Override
    public void ejecutar() {
        ventilador.apagar();
    }
    @Override
    public void deshacer() {
        ventilador.encender();
    }
}
