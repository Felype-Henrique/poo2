abstract class Bebida {
    public abstract String getDescricao();

    public abstract double calculaCusto();
}

class Espresso extends Bebida {
    @Override
    public String getDescricao() {
        return "Espresso";
    }

    @Override
    public double calculaCusto() {
        return 5.0;
    }
}

class Decaf extends Bebida {
    @Override
    public String getDescricao() {
        return "Café Descafeinado";
    }

    @Override
    public double calculaCusto() {
        return 4.0;
    }
}

abstract class IngredienteDecorator extends Bebida {
    protected Bebida bebida;

    public IngredienteDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public abstract String getDescricao();
}

class Leite extends IngredienteDecorator {
    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " com Leite";
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 1.5;
    }
}

class Canela extends IngredienteDecorator {
    public Canela(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " com Canela";
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 0.8;
    }
}

class Chocolate extends IngredienteDecorator {
    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " com Chocolate";
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 2.0;
    }
}

public class Cafeteria {
    public static void main(String[] args) {
        Bebida espressoComLeiteCanela = new Espresso();
        espressoComLeiteCanela = new Leite(espressoComLeiteCanela);
        espressoComLeiteCanela = new Canela(espressoComLeiteCanela);

        System.out.println("Bebida: " + espressoComLeiteCanela.getDescricao());
        System.out.println("Custo: R$ " + espressoComLeiteCanela.calculaCusto());

        Bebida decafComChocolate = new Decaf();
        decafComChocolate = new Chocolate(decafComChocolate);

        System.out.println("\nBebida: " + decafComChocolate.getDescricao());
        System.out.println("Custo: R$ " + decafComChocolate.calculaCusto());
    }
}
