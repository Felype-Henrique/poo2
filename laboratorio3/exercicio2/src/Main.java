public class Main {
    public static void main(String[] args) {
        CalculadoraBinaria calculadoraBinaria = new CalculadoraBinaria();

        Calculadora calculadoraAdapter = new CalculadoraDecimalAdapter(calculadoraBinaria);

        int somaDecimal = calculadoraAdapter.somar(10, 5);
        int subtracaoDecimal = calculadoraAdapter.subtrair(10, 5);
        int multiplicacaoDecimal = calculadoraAdapter.multiplicar(10, 5);

        System.out.println("Soma (Decimal): 10 + 5 = " + somaDecimal);
        System.out.println("Subtração (Decimal): 10 - 5 = " + subtracaoDecimal);
        System.out.println("Multiplicação (Decimal): 10 * 5 = " + multiplicacaoDecimal);

        int somaBinario = calculadoraAdapter.somar(0b1010, 0b101);
        int subtracaoBinario = calculadoraAdapter.subtrair(0b1010, 0b101);

        System.out.println("Soma (Binário): 1010 + 101 = " + somaBinario);
        System.out.println("Subtração (Binário): 1010 - 101 = " + subtracaoBinario);
    }
}
