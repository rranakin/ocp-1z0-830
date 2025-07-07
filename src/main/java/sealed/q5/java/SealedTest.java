package sealed.q5.java;

public class SealedTest {
    public static void main(String[] args) {
        Readable r1 = new Book();
        Readable r2 = new Journal();

        System.out.println("Tipo 1: " + r1.getClass().getSimpleName());
        System.out.println("Tipo 2: " + r2.getClass().getSimpleName());
        System.out.println("✅ Código compilado e executado com sucesso.");
    }
}
