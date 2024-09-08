public class Etios implements IVehicle {
    @Override
    public void start() {
        System.out.println("Etios ligando...");
    }

    @Override
    public void drive() {
        System.out.println("Etios rodando...");
    }

    @Override
    public void stop() {
        System.out.println("Etios parando...");
    }
}
