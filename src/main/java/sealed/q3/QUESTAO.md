# ☕ Java Quiz — Sealed Class: Erros de Compilação

## 📌 Question (EN)

Given the following code:

```java
interface Readable { }

non-sealed class Device implements Readable { }

sealed class DocType implements Readable permits Book, Journal { }

final non-sealed class Book extends DocType { }

final class Journal extends DocType { }
```

Which types will fail compilation?
You had to select 2 options.

Options:
- Readable

- Device

- DocType

- Book

- Journal

## 📌 Questão (PT-BR)
Dado o seguinte código:

```java
interface Readable { }

non-sealed class Device implements Readable { }

sealed class DocType implements Readable permits Book, Journal { }

final non-sealed class Book extends DocType { }

final class Journal extends DocType { }
```

Quais tipos irão falhar na compilação?
Você deve selecionar 2 opções.

- Readable

- Device

- DocType

- Book

- Journal