# ☕ Java Quiz — Sealed Class

## 📌 Question (EN / PT-BR)

**Given the following code:**
```java
sealed interface Cacheable permits Value, Result {
    default void clear() { System.out.println("clearing cache..."); }
}
```

Which of the following definitions will compile without error?

(You had to select 2 options.)

Qual das definições a seguir compilará sem erro?

(Você deveria selecionar 2 opções.)


Options / Opções:
```
interface Value extends Cacheable { }
non-sealed abstract class Result implements Cacheable { }
```

```
non-sealed interface Value extends Cacheable { }
non-sealed abstract class Result implements Cacheable { }
```

```
abstract non-sealed interface Value extends Cacheable { }
sealed abstract class Result implements Cacheable permits IntResult { }
final class IntResult extends Result { }
```

```
non-sealed interface Value extends Cacheable { }
non-sealed abstract class Result { }
```

```
non-sealed interface Value extends Cacheable { }
abstract class Result { }
final class IntResult extends Result implements Cacheable { }
```