public class Cliente {

    public static void main(String[] args) {

        // Criando todos os tipo de carro
        System.out.println("\n\nCarros Mercedes");
        CarroFactory fabricaMercedes = new MercedesFactory();
        Carro mercedes1 = fabricaMercedes.criarSUV();
        Carro mercedes2 = fabricaMercedes.criarSedan();
        Carro mercedes3 = fabricaMercedes.criarEsportivo();

        System.out.println(mercedes1.exibirInfo());
        System.out.println(mercedes2.exibirInfo());
        System.out.println(mercedes3.exibirInfo());

        System.out.println("\n\nCarros BMW");
        CarroFactory fabricaBMW = new BMWFactory();
        Carro bmw1 = fabricaBMW.criarSUV();
        Carro bmw2 = fabricaBMW.criarSedan();
        Carro bmw3 = fabricaBMW.criarEsportivo();

        System.out.println(bmw1.exibirInfo());
        System.out.println(bmw2.exibirInfo());
        System.out.println(bmw3.exibirInfo());

    }

}
