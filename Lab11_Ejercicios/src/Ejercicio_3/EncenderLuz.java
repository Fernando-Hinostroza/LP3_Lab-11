package Ejercicio_3;

public class EncenderLuz implements Command {
    private Luz luz;
    public EncenderLuz(Luz luz) {
        this.luz = luz;
    }
    @Override
    public void ejecutar() {
        luz.encender();
    }
    @Override
    public void deshacer() {
        luz.apagar();
    }
}
