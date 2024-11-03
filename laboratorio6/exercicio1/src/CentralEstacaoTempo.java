import java.util.ArrayList;
import java.util.List;

public class CentralEstacaoTempo {
    private List<Observador> observadores;
    private float temperatura;
    private float umidade;
    private float vento;

    public CentralEstacaoTempo() {
        observadores = new ArrayList<>();
    }

    public void registrarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    private void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar(temperatura, umidade, vento);
        }
    }

    public void atualizarDados(float temperatura, float umidade, float vento) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.vento = vento;
        notificarObservadores();
    }
}
