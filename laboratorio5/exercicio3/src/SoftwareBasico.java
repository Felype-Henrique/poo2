public class SoftwareBasico implements Software {
    @Override
    public void usarFuncaoBasica() {
        System.out.println("Usando função básica do software.");
    }

    @Override
    public void usarFuncaoPremium() {
        System.out.println("Função premium não disponível para este usuário.");
    }
}
