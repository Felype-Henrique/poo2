public class Cappuccino extends Bebida {
    @Override
    protected void preparar() {
        System.out.println("Preparando o café para o cappuccino");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando leite espumado e canela ao cappuccino");
    }
}
