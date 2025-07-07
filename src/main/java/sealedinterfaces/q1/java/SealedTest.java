package sealedinterfaces.q1.java;

public class SealedTest {
    public static void main(String[] args) {
        Cacheable value = new ValueImpl();
        Cacheable result = new ResultImpl();

        value.clear();  // Imprime: Limpando cache...
        result.clear(); // Imprime: Limpando cache...

        ((Value) value).print();   // Imprime: Executando ValueImpl
        ((Result) result).print(); // Imprime: Executando ResultImpl

        System.out.println("✅ Código executado com sucesso!");
    }
}
