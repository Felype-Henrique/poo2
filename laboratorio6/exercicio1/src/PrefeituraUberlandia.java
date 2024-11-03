public class PrefeituraUberlandia implements Observador {

    @Override
    public void atualizar(float temperatura, float umidade, float vento) {
        System.out.println("Prefeitura de Uberlândia - Umidade relativa do ar: " + umidade + "%");
        if (umidade < 30) {
            System.out.println("Alerta: Umidade baixa! Atenção aos cuidados com a saúde.");
        }
    }
}
