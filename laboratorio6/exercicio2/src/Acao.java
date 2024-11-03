

import java.util.ArrayList;
import java.util.List;

public class Acao {
    private String nome;
    private double preco;
    private List<Investidor> investidores;

    public Acao(String nome, double precoInicial) {
        this.nome = nome;
        this.preco = precoInicial;
        this.investidores = new ArrayList<>();
    }

    public void registrarInvestidor(Investidor investidor) {
        investidores.add(investidor);
    }

    public void removerInvestidor(Investidor investidor) {
        investidores.remove(investidor);
    }

    private void notificarInvestidores() {
        for (Investidor investidor : investidores) {
            investidor.atualizar(this);
        }
    }

    public void atualizarPreco(double novoPreco) {
        this.preco = novoPreco;
        System.out.println("Novo preço da ação " + nome + ": R$ " + preco);
        notificarInvestidores();
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}
