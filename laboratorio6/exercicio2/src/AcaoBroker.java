public class AcaoBroker {
    public void comprarAcao(Acao acao, InvestidorConcreto investidor) {
        System.out.println("Corretor: Comprando ação " + acao.getNome() + " para o investidor " + investidor.getNome());
    }

    public void venderAcao(Acao acao, InvestidorConcreto investidor) {
        System.out.println("Corretor: Vendendo ação " + acao.getNome() + " para o investidor " + investidor.getNome());
    }
}
