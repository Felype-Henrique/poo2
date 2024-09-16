interface Ave {
    void voar();

    void emitirSom();
}

class Pato implements Ave {
    @Override
    public void voar() {
        System.out.println("O pato está voando!");
    }

    @Override
    public void emitirSom() {
        System.out.println("O pato está grasnando!");
    }
}

class Pavao implements Ave {
    @Override
    public void voar() {
        System.out.println("O pavão não pode voar.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O pavão está cantando!");
    }
}

class PatoDomestico extends Pato {
    @Override
    public void emitirSom() {
        System.out.println("O pato doméstico está grasnando baixinho.");
    }
}

class PavaoAzul extends Pavao {
    @Override
    public void emitirSom() {
        System.out.println("O pavão azul está cantando elegantemente!");
    }
}

class PavaoAdapter implements Ave {
    private Pavao pavao;

    public PavaoAdapter(Pavao pavao) {
        this.pavao = pavao;
    }

    @Override
    public void voar() {
        System.out.println("Adaptando o comportamento: o pavão não pode voar.");
    }

    @Override
    public void emitirSom() {
        pavao.emitirSom();
    }
}

public class Main {
    public static void main(String[] args) {

        Ave pato = new Pato();
        Ave patoDomestico = new PatoDomestico();
        Ave pavao = new PavaoAdapter(new Pavao());
        Ave pavaoAzul = new PavaoAdapter(new PavaoAzul());

        System.out.println("Pato:");
        pato.voar();
        pato.emitirSom();

        System.out.println("\nPato Doméstico:");
        patoDomestico.voar();
        patoDomestico.emitirSom();

        System.out.println("\nPavão (com adapter):");
        pavao.voar();
        pavao.emitirSom();

        System.out.println("\nPavão Azul (com adapter):");
        pavaoAzul.voar();
        pavaoAzul.emitirSom();
    }
}
