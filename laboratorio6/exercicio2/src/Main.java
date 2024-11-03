public class Main {
    public static void main(String[] args) {
        AcaoBroker broker = new AcaoBroker();

        Acao acaoX = new Acao("Ação X", 50.00);

        InvestidorConcreto investidor1 = new InvestidorConcreto("João", 40.00, 55.00, broker);
        InvestidorConcreto investidor2 = new InvestidorConcreto("Maria", 45.00, 60.00, broker);

        acaoX.registrarInvestidor(investidor1);
        acaoX.registrarInvestidor(investidor2);

        acaoX.atualizarPreco(42.00);
        acaoX.atualizarPreco(56.00);
        acaoX.atualizarPreco(39.00);
        acaoX.atualizarPreco(61.00);
    }
}
