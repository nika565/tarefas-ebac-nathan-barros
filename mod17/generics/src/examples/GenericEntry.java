package examples;

public class GenericEntry<T, E> {

    private T data;
    private E codigo;

    public GenericEntry(T data, E codigo) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public E getCodigo() {
        return this.codigo;
    }

}
