public class TesteCarro {
    public static void main(String[] args) {
        Motor motor = new Motor();
        CintoSeguranca cintoSeguranca = new CintoSeguranca();
        Porta porta = new Porta();
        Farol farol = new Farol();
        Radio radio = new Radio();

        CarroFachada carro = new CarroFachada(motor, cintoSeguranca, porta, farol, radio);

        // Iniciar a corrida
        carro.iniciarCorrida("89.1 FM");

        // Finalizar a corrida
        carro.finalizarCorrida();
    }
}
