public class Civic implements IVehicle {
    @Override
    public void start() {
        System.out.println("Civic ligando...");
    }

    @Override
    public void drive() {
        System.out.println("Civic rodando...");
    }

    @Override
    public void stop() {
        System.out.println("Civic parando...");
    }
}
