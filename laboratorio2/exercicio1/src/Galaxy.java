public class Galaxy implements Celular {
    private String modelo;

    public Galaxy(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void fazLigacao() {
        System.out.println("Fazendo ligação com o " + modelo);
    }

    @Override
    public void tiraFoto() {
        System.out.println("Tirando foto com o " + modelo);
    }
}
