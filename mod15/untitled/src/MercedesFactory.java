public class MercedesFactory implements CarroFactory {

    @Override
    public Carro criarSUV() {
        return new SUVMercedes();
    }

    @Override
    public Carro criarSedan() {
        return new SedanMercedes();
    }

    @Override
    public Carro criarEsportivo() {
        return new EsportivoMercedes();
    }
}
