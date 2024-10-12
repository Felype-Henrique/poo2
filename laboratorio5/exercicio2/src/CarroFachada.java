public class CarroFachada {
    private Motor motor;
    private CintoSeguranca cintoSeguranca;
    private Porta porta;
    private Farol farol;
    private Radio radio;

    public CarroFachada(Motor motor, CintoSeguranca cintoSeguranca, Porta porta, Farol farol, Radio radio) {
        this.motor = motor;
        this.cintoSeguranca = cintoSeguranca;
        this.porta = porta;
        this.farol = farol;
        this.radio = radio;
    }

    public void iniciarCorrida(String estacaoPreferida) {
        motor.ligar();
        porta.trancar();
        cintoSeguranca.travar();
        farol.acender();
        radio.ligar();
        radio.sintonizar(estacaoPreferida);
    }

    public void finalizarCorrida() {
        motor.desligar();
        porta.destrancar();
        cintoSeguranca.destravar();
        farol.apagar();
        radio.desligar();
    }
}
