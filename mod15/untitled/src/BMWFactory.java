public class BMWFactory implements CarroFactory{
    @Override
    public Carro criarSUV() {
        return new SUVBMW();
    }

    @Override
    public Carro criarSedan() {
        return new SedanBMW();
    }

    @Override
    public Carro criarEsportivo() {
        return new EsportivoBMW();
    }
}
