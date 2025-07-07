package sealed.q6.java;

sealed interface Cacheable permits Value, Result {
    default void clear() {
        System.out.println("clearing cache...");
    }
}
