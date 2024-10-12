public class SoftwarePremium implements Software {
    @Override
    public void usarFuncaoBasica() {
        System.out.println("Usando função básica do software.");
    }

    @Override
    public void usarFuncaoPremium() {
        System.out.println("Usando função premium do software.");
    }
}
