public abstract class Bebida {
    public final void prepararBebida() {
        aquecerAgua();
        preparar();
        colocarNaXicara();
        adicionarCondimentos();
    }

    private void aquecerAgua() {
        System.out.println("Aquecendo a água");
    }

    protected abstract void preparar();

    private void colocarNaXicara() {
        System.out.println("Colocando na xícara");
    }

    protected abstract void adicionarCondimentos();
}
