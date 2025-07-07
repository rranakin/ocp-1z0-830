# ☕ Java Quiz — Sealed Class e Permits: Erros de Compilação

## 📌 Question (EN)

```java
interface Readable { }

sealed class Document implements Readable permits Book { }

non-sealed class Book implements Readable { }

final class Journal extends Book { }
```
Identify correct statements.
You had to select 2 options.

Options:
- Both Document and Book will cause compilation errors.

- All three classes Document, Book, and Journal will cause compilation errors.

- Making the Book class extend Document will eliminate all compilation errors.

- Adding an extends Document clause to Book and removing the extends Book clause from Journal will eliminate all compilation errors.

- Only the Journal class will cause compilation error.

- Making the Book class extend Document will cause Journal class to fail compilation.

## 📌 Questão (PT-BR)
Identifique as afirmações corretas.
Você deve selecionar 2 opções.

Opções:

- Tanto a classe Document quanto a classe Book causarão erros de compilação.

- As três classes Document, Book e Journal causarão erros de compilação.

- Fazer com que a classe Book estenda Document eliminará todos os erros de compilação.

- Adicionar a cláusula extends Document à classe Book e remover a cláusula extends Book da classe Journal eliminará todos os erros de compilação.

- Apenas a classe Journal causará erro de compilação.

- Fazer com que a classe Book estenda Document fará com que a classe Journal falhe na compilação.