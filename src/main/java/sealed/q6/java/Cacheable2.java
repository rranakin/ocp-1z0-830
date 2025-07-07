package sealed.q6.java;

sealed interface Cacheable2 permits Value2, Result2 {
    default void clear() {
        System.out.println("clearing cache...");
    }
}
