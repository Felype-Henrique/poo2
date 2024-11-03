public class Main {
    public static void main(String[] args) {
        CentralEstacaoTempo cet = new CentralEstacaoTempo();

        PrefeituraUberlandia prefeitura = new PrefeituraUberlandia();
        AeroportoUberlandia aeroporto = new AeroportoUberlandia();

        cet.registrarObservador(prefeitura);
        cet.registrarObservador(aeroporto);

        cet.atualizarDados(28, 25, 45);
        cet.atualizarDados(30, 45, 10);
    }
}
