public class Main {
    public static void main(String[] args) {

        IVehicleMaker toyota = Toyota.getInstancia();
        IVehicleMaker honda = Honda.getInstancia();

        IVehicle corolla = toyota.makeVehicle("Corolla");
        IVehicle hilux = toyota.makeVehicle("Hilux");

        IVehicle civic = honda.makeVehicle("Civic");
        IVehicle fit = honda.makeVehicle("Fit");

        corolla.start();
        corolla.drive();
        corolla.stop();

        hilux.start();
        hilux.drive();
        hilux.stop();

        civic.start();
        civic.drive();
        civic.stop();

        fit.start();
        fit.drive();
        fit.stop();
    }
}
