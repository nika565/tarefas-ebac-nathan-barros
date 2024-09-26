package examples;

import examples.fruta.Banana;
import examples.fruta.Fruta;
import examples.fruta.Maca;

import java.util.ArrayList;
import java.util.List;

public class ExemplosJavaGenerics {

    public static void main(String[] args){
        List<String> lista = new ArrayList();
        lista.add("Rodrigo");
        lista.add("1");
        imprimir(lista);

        List<Long> listaNumeros = new ArrayList<>();
        listaNumeros.add(1l);
        listaNumeros.add(2l);
        imprimir(listaNumeros);

        String primeiroSt = pegarPrimeiroLista(lista);
        System.out.println(primeiroSt);

        Long primeiroLong = pegarPrimeiroLista(listaNumeros);
        System.out.println(primeiroLong);

        List<Fruta> frutas = new ArrayList<>();
        frutas.add(new Maca());
        frutas.add(new Banana());
        imprimirFrutas(frutas);
    }

    public static <T> void imprimir(List<T> lista) {
        for(T st: lista){
            System.out.println(st);
        }
    }

    public static <T> T pegarPrimeiroLista(List<T> lista){
        return lista.get(0);
    }

    public static void imprimirFrutas(List<Fruta> lista){
        for (Fruta fruta: lista){
            System.out.println(fruta);
        }
    }

}
