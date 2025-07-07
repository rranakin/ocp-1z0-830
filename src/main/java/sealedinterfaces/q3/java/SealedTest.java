package sealedinterfaces.q3.java;

public class SealedTest {
    public static void main(String[] args) {
        Readable doc1 = new Book();
        Readable doc2 = new Journal();

        System.out.println("Tipo 1: " + doc1.getClass().getSimpleName());
        System.out.println("Tipo 2: " + doc2.getClass().getSimpleName());

        System.out.println("✅ Código executado com sucesso!");
    }
}
