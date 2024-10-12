public class TesteCinema {
    public static void main(String[] args) {
        Amplificador amplificador = new Amplificador();
        Luzes luzes = new Luzes();
        MaquinaPipoca maquinaPipoca = new MaquinaPipoca();
        Projetor projetor = new Projetor();
        Telao telao = new Telao();
        PlayerStreaming playerStreaming = new PlayerStreaming();

        CinemaFachada cinema = new CinemaFachada(amplificador, luzes, maquinaPipoca, projetor, telao, playerStreaming);

        cinema.iniciarFilme("Teste");

        cinema.fimDoFilme();
    }
}
