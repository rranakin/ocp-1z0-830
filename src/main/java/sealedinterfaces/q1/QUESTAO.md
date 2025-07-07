# ☕ Java Quiz — Sealed Interfaces

## 📌 Question (EN)

Given the following code:

```java
sealed interface Cacheable permits Value, Result {
    default void clear() {
        System.out.println("clearing cache...");
    }
}
```
Which of the following definition will compile without error?

## 📌 Questão (PT-BR)

Dado o seguinte código:

```java
sealed interface Cacheable permits Value, Result {
    default void clear() {
        System.out.println("clearing cache...");
    }
}
```
Qual das seguintes definições irá compilar sem erro?

#### OPTION 1
```java
non-sealed interface Value extends Cacheable { }
non-sealed interface Result extends Cacheable { }
```

#### OPTION 2
```java
interface Value extends Cacheable { }
interface Result extends Cacheable { }
```

#### OPTION 3
```java
sealed interface Value extends Cacheable { }
sealed interface Result extends Cacheable { }
```

#### OPTION 4
```java
None of the above
```