public abstract class Pedido {
    protected int quantidadeItens;
    protected double valorPorItem;

    public Pedido(int quantidadeItens, double valorPorItem) {
        this.quantidadeItens = quantidadeItens;
        this.valorPorItem = valorPorItem;
    }

    public final void processarPedido() {
        double total = calcularTotal();
        processarPagamento(total);
        decidirEntrega();
    }

    private double calcularTotal() {
        return quantidadeItens * valorPorItem;
    }

    protected abstract void processarPagamento(double total);

    protected abstract void decidirEntrega();
}
