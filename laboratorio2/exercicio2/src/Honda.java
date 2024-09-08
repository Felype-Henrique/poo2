public class Honda implements IVehicleMaker {
    private static Honda instancia;

    private Honda() {
    }

    public static Honda getInstancia() {
        if (instancia == null) {
            instancia = new Honda();
        }
        return instancia;
    }

    @Override
    public IVehicle makeVehicle(String modelo) {
        switch (modelo.toLowerCase()) {
            case "city":
                return new City();
            case "civic":
                return new Civic();
            case "fit":
                return new Fit();
            default:
                throw new IllegalArgumentException("Modelo desconhecido: " + modelo);
        }
    }
}
