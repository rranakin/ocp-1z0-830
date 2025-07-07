## ✅ Respostas Corretas
✅ Both Document and Book will cause compilation errors.

✅ Making the Book class extend Document will eliminate all compilation errors.

# 💡 Explicação
🔴 Por que a classe Document falha?
```java
sealed class Document implements Readable permits Book { }
```
A classe Document é sealed e lista Book em sua cláusula permits.
Porém, a classe Book não estende diretamente Document — e isso é obrigatório.

# ➡️ Regra: Todo tipo listado em permits deve estender (ou implementar) diretamente o tipo sealed.

🔴 Por que a classe Book também falha?
```java
non-sealed class Book implements Readable { }
```
A classe Book é declarada como non-sealed, o que é válido somente se ela estender ou implementar diretamente uma sealed class ou sealed interface.
No entanto, Readable não é sealed, então isso causa erro de compilação.

# ➡️ Regra: Tipos non-sealed devem obrigatoriamente ser subtipos diretos de um tipo sealed.

✅ Correção sugerida
Modificar Book para que ela estenda Document, como indicado na opção correta:

```java
non-sealed class Book extends Document { }
```
Dessa forma:

Book passa a ser uma subtipo direto de Document (como exigido pelo permits)

Document compila com a cláusula permits Book

Book como non-sealed também se torna válido, pois está estendendo um tipo sealed

Journal, que estende Book, também é válida

## 📘 Regras importantes recapituladas
Uma classe sealed deve ter apenas subtipos diretos listados no permits.

Esses subtipos devem ser sealed, non-sealed ou final.

Tipos non-sealed só podem ser usados se estenderem diretamente um tipo sealed.

Subclasses indiretas não precisam estar listadas no permits.