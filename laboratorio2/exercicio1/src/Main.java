public class Main {
    public static void main(String[] args) {

        FabricanteCelular apple = Apple.getInstancia();
        FabricanteCelular samsung = Samsung.getInstancia();

        Celular iphone = apple.constroiCelular("IPhoneX");
        Celular galaxy = samsung.constroiCelular("Galaxy20");

        iphone.fazLigacao();
        iphone.tiraFoto();

        galaxy.fazLigacao();
        galaxy.tiraFoto();
    }
}
