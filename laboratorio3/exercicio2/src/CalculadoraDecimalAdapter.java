public class CalculadoraDecimalAdapter implements Calculadora {
    private CalculadoraBinaria calculadoraBinaria;

    public CalculadoraDecimalAdapter(CalculadoraBinaria calculadoraBinaria) {
        this.calculadoraBinaria = calculadoraBinaria;
    }

    @Override
    public int somar(int a, int b) {
        String bin1 = Integer.toBinaryString(a);
        String bin2 = Integer.toBinaryString(b);
        String resultadoBin = calculadoraBinaria.somar(bin1, bin2);
        return Integer.parseInt(resultadoBin, 2);
    }

    @Override
    public int subtrair(int a, int b) {
        String bin1 = Integer.toBinaryString(a);
        String bin2 = Integer.toBinaryString(b);
        String resultadoBin = calculadoraBinaria.subtrair(bin1, bin2);
        return Integer.parseInt(resultadoBin, 2);
    }

    @Override
    public int multiplicar(int a, int b) {
        return a * b;
    }
}
