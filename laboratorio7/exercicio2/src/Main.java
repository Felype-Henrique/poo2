/*
 * Padrão Template Method vs Decorator:
 * - O Template Method define a estrutura básica de um algoritmo na classe base, permitindo que as subclasses implementem
 *   certos passos do algoritmo sem alterar sua estrutura. Ele se concentra em definir uma sequência fixa de operações.
 * - O Decorator, por outro lado, é usado para adicionar comportamento adicional a objetos individualmente e de forma dinâmica,
 *   empilhando funcionalidades sem alterar a estrutura de uma classe base.
 */

public class Main {
    public static void main(String[] args) {
        Pedido pedidoOnline = new PedidoOnline(3, 50.0);
        System.out.println("Processando Pedido Online:");
        pedidoOnline.processarPedido();

        System.out.println("\nProcessando Pedido na Loja:");
        Pedido pedidoNaLoja = new PedidoNaLoja(2, 75.0);
        pedidoNaLoja.processarPedido();

        System.out.println("\nProcessando Pedido com Criptomoedas:");
        Pedido pedidoCripto = new PedidoCripto(1, 150.0);
        pedidoCripto.processarPedido();
    }
}
