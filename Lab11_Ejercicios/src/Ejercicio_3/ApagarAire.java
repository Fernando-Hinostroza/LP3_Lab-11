package Ejercicio_3;

public class ApagarAire implements Command {
    private AireAcondicionado aire;
    public ApagarAire(AireAcondicionado aire) {
        this.aire = aire;
    }
    @Override
    public void ejecutar() {
        aire.apagar();
    }
    @Override
    public void deshacer() {
        aire.encender();
    }
}
