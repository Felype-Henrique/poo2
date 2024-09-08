public class Toyota implements IVehicleMaker {
    private static Toyota instancia;

    private Toyota() {
    }

    public static Toyota getInstancia() {
        if (instancia == null) {
            instancia = new Toyota();
        }
        return instancia;
    }

    @Override
    public IVehicle makeVehicle(String modelo) {
        switch (modelo.toLowerCase()) {
            case "corolla":
                return new Corolla();
            case "hilux":
                return new Hilux();
            case "etios":
                return new Etios();
            default:
                throw new IllegalArgumentException("Modelo desconhecido: " + modelo);
        }
    }
}
