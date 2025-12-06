package Ejercicio_3;

public class ApagarLuz implements Command {
    private Luz luz;
    public ApagarLuz(Luz luz) {
        this.luz = luz;
    }
    @Override
    public void ejecutar() {
        luz.apagar();
    }
    @Override
    public void deshacer() {
        luz.encender();
    }
}

