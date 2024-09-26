package examples;

public class ExemploGenericEntry {
    public static void main(String[] args){
        GenericEntry<String, Long> entry = new GenericEntry<>("Teste", 10L);
        System.out.println(entry.getData());

        GenericEntry<Long, Integer> entryLong = new GenericEntry<>(10L, 11);
        System.out.println(entryLong.getData());


    }
}
