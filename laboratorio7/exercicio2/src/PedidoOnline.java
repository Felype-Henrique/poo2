public class PedidoOnline extends Pedido {
    public PedidoOnline(int quantidadeItens, double valorPorItem) {
        super(quantidadeItens, valorPorItem);
    }

    @Override
    protected void processarPagamento(double total) {
        System.out.println("Processando pagamento online de: R$" + total);
    }

    @Override
    protected void decidirEntrega() {
        System.out.println("O pedido será entregue no endereço cadastrado.");
    }
}
