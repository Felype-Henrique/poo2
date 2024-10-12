public class ProxySoftware implements Software {
    private Software software;
    private boolean temAssinaturaPremium;

    public ProxySoftware(boolean temAssinaturaPremium) {
        this.temAssinaturaPremium = temAssinaturaPremium;
        if (temAssinaturaPremium) {
            this.software = new SoftwarePremium();
        } else {
            this.software = new SoftwareBasico();
        }
    }

    @Override
    public void usarFuncaoBasica() {
        software.usarFuncaoBasica();
    }

    @Override
    public void usarFuncaoPremium() {
        if (temAssinaturaPremium) {
            software.usarFuncaoPremium();
        } else {
            System.out.println("Acesso negado. Por favor, assine o serviço premium para usar esta função.");
        }
    }
}
