public class CinemaFachada {
    private Amplificador amplificador;
    private Luzes luzes;
    private MaquinaPipoca maquinaPipoca;
    private Projetor projetor;
    private Telao telao;
    private PlayerStreaming playerStreaming;

    public CinemaFachada(Amplificador amplificador, Luzes luzes, MaquinaPipoca maquinaPipoca, Projetor projetor,
            Telao telao, PlayerStreaming playerStreaming) {
        this.amplificador = amplificador;
        this.luzes = luzes;
        this.maquinaPipoca = maquinaPipoca;
        this.projetor = projetor;
        this.telao = telao;
        this.playerStreaming = playerStreaming;
    }

    public void iniciarFilme(String filme) {
        maquinaPipoca.ligar();
        maquinaPipoca.rebentarPipoca();
        luzes.desligar();
        telao.abaixar();
        projetor.ligar();
        amplificador.ligar();
        amplificador.ajustarVolume(10);
        playerStreaming.ligar();
        playerStreaming.play(filme);
    }

    public void fimDoFilme() {
        System.out.println("Fim do filme. Desligando tudo...");
        playerStreaming.desligar();
        projetor.desligar();
        telao.subir();
        amplificador.desligar();
        luzes.ligar();
        maquinaPipoca.desligar();
    }
}
