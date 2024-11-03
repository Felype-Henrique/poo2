public class InvestidorConcreto implements Investidor {
    private String nome;
    private double limiteMinimo;
    private double limiteMaximo;
    private AcaoBroker broker;

    public InvestidorConcreto(String nome, double limiteMinimo, double limiteMaximo, AcaoBroker broker) {
        this.nome = nome;
        this.limiteMinimo = limiteMinimo;
        this.limiteMaximo = limiteMaximo;
        this.broker = broker;

    }

    @Override
    public void atualizar(Acao acao) {
        double precoAtual = acao.getPreco();
        System.out.println(
                "Investidor " + nome + " foi notificado. Preço atual de " + acao.getNome() + ": R$ " + precoAtual);

        if (precoAtual >= limiteMaximo) {
            System.out.println("Investidor " + nome + ": Preço máximo atingido! Vendendo ação " + acao.getNome());
            broker.venderAcao(acao, this);
        } else if (precoAtual <= limiteMinimo) {
            System.out.println("Investidor " + nome + ": Preço mínimo atingido! Comprando ação " + acao.getNome());
            broker.comprarAcao(acao, this);
        }
    }

    public String getNome() {
        return nome;
    }
}
