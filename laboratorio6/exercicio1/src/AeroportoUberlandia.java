public class AeroportoUberlandia implements Observador {

    @Override
    public void atualizar(float temperatura, float umidade, float vento) {
        System.out.println("Aeroporto de Uberlândia - Velocidade do vento: " + vento + " km/h");
        if (vento > 40) {
            System.out.println("Alerta: Rajadas de vento fortes! Operações aeroportuárias podem ser impactadas.");
        }
    }
}
