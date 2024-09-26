package TarefaModulo15;

import java.util.ArrayList;
import java.util.List;

// Classe base Carro
class Carro {
    private String marca;
    private String modelo;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Carro [marca=" + marca + ", modelo=" + modelo + "]";
    }
}

// Subclasses de Carro
class Sedan extends Carro {
    public Sedan(String marca, String modelo) {
        super(marca, modelo);
    }
}

class SUV extends Carro {
    public SUV(String marca, String modelo) {
        super(marca, modelo);
    }
}

class Caminhao extends Carro {
    public Caminhao(String marca, String modelo) {
        super(marca, modelo);
    }
}

// Classe que aceita qualquer tipo de carro utilizando Generics
class Garagem<T extends Carro> {
    private List<T> carros = new ArrayList<>();

    public void adicionarCarro(T carro) {
        carros.add(carro);
    }

    public List<T> getCarros() {
        return carros;
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando uma garagem que pode armazenar qualquer tipo de carro
        Garagem<Carro> garagem = new Garagem<>();

        // Adicionando diferentes tipos de carros
        garagem.adicionarCarro(new Sedan("Toyota", "Corolla"));
        garagem.adicionarCarro(new SUV("Honda", "CR-V"));
        garagem.adicionarCarro(new Caminhao("Volvo", "FH16"));

        // Exibindo os carros na garagem
        for (Carro carro : garagem.getCarros()) {
            System.out.println(carro);
        }
    }
}

