package sealed.q1.java;

public sealed interface Cacheable permits Value, Result {
    default void clear() {
        System.out.println("Limpando cache...");
    }
}
