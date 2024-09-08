public class City implements IVehicle {
    @Override
    public void start() {
        System.out.println("City ligando...");
    }

    @Override
    public void drive() {
        System.out.println("City rodando...");
    }

    @Override
    public void stop() {
        System.out.println("City parando...");
    }
}
