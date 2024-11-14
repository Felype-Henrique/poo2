public class Cha extends Bebida {
    @Override
    protected void preparar() {
        System.out.println("Preparando o chá");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando limão ou mel ao chá");
    }
}
