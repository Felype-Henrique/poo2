public class PedidoNaLoja extends Pedido {
    public PedidoNaLoja(int quantidadeItens, double valorPorItem) {
        super(quantidadeItens, valorPorItem);
    }

    @Override
    protected void processarPagamento(double total) {
        System.out.println("Processando pagamento no caixa da loja: R$" + total);
    }

    @Override
    protected void decidirEntrega() {
        System.out.println("O cliente retirará o pedido na loja.");
    }
}
