public class Cafe extends Bebida {
    @Override
    protected void preparar() {
        System.out.println("Preparando o café");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando açúcar e/ou leite ao café");
    }
}
