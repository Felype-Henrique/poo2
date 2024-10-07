abstract class Pizza {
    public abstract String getDescricao();

    public abstract double getCusto();
}

class MassaFinaPizza extends Pizza {
    public String getDescricao() {
        return "Pizza de Massa Fina";
    }

    public double getCusto() {
        return 10.0;
    }
}

class MassaEspessaPizza extends Pizza {
    public String getDescricao() {
        return "Pizza de Massa Espessa";
    }

    public double getCusto() {
        return 12.0;
    }
}

abstract class IngredienteDecorator extends Pizza {
    protected Pizza pizza;

    public IngredienteDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract String getDescricao();
}

class Queijo extends IngredienteDecorator {
    public Queijo(Pizza pizza) {
        super(pizza);
    }

    public String getDescricao() {
        return pizza.getDescricao() + ", Queijo";
    }

    public double getCusto() {
        return pizza.getCusto() + 2.0;
    }
}

class Tomate extends IngredienteDecorator {
    public Tomate(Pizza pizza) {
        super(pizza);
    }

    public String getDescricao() {
        return pizza.getDescricao() + ", Tomate";
    }

    public double getCusto() {
        return pizza.getCusto() + 1.5;
    }
}

class Ovo extends IngredienteDecorator {
    public Ovo(Pizza pizza) {
        super(pizza);
    }

    public String getDescricao() {
        return pizza.getDescricao() + ", Ovo";
    }

    public double getCusto() {
        return pizza.getCusto() + 1.8;
    }
}

public class Pizzaria {
    public static void main(String[] args) {
        Pizza pizzaMarguerita = new MassaFinaPizza();
        pizzaMarguerita = new Queijo(pizzaMarguerita);
        pizzaMarguerita = new Tomate(pizzaMarguerita);

        System.out.println("Pizza Marguerita:");
        System.out.println("Descrição: " + pizzaMarguerita.getDescricao());
        System.out.println("Custo: R$ " + pizzaMarguerita.getCusto());

        Pizza pizzaPortuguesa = new MassaEspessaPizza();
        pizzaPortuguesa = new Queijo(pizzaPortuguesa);
        pizzaPortuguesa = new Ovo(pizzaPortuguesa);
        pizzaPortuguesa = new Tomate(pizzaPortuguesa);

        System.out.println("\nPizza Portuguesa:");
        System.out.println("Descrição: " + pizzaPortuguesa.getDescricao());
        System.out.println("Custo: R$ " + pizzaPortuguesa.getCusto());
    }
}
