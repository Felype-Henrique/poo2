public class PedidoCripto extends Pedido {
    public PedidoCripto(int quantidadeItens, double valorPorItem) {
        super(quantidadeItens, valorPorItem);
    }

    @Override
    protected void processarPagamento(double total) {
        System.out.println("Processando pagamento via criptomoedas no valor equivalente a: R$" + total);
    }

    @Override
    protected void decidirEntrega() {
        System.out.println("O pedido será entregue no endereço cadastrado.");
    }
}
