package Ejercicio_3;

public class EncenderAire implements Command {
    private AireAcondicionado aire;
    public EncenderAire(AireAcondicionado aire) {
        this.aire = aire;
    }
    @Override
    public void ejecutar() {
        aire.encender();
    }
    @Override
    public void deshacer() {
        aire.apagar();
    }
}

