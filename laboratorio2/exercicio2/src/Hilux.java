public class Hilux implements IVehicle {
    @Override
    public void start() {
        System.out.println("Hilux ligando...");
    }

    @Override
    public void drive() {
        System.out.println("Hilux rodando...");
    }

    @Override
    public void stop() {
        System.out.println("Hilux parando...");
    }
}
