## ✅ Respostas corretas (tipos que falham)
✅ Device

✅ Book


## ❌ Por que esses tipos falham?
🔻 Device
```java
non-sealed class Device implements Readable { }
```
Erro:
Uma classe só pode ser declarada non-sealed se estender uma classe sealed ou implementar uma interface sealed.
A interface Readable não é sealed, logo non-sealed é inválido aqui.

✅ Correção possível:

```java
class Device implements Readable { } // ou transformar Readable em sealed
```

🔻 Book
```java
final non-sealed class Book extends DocType { }
```
Erro:

Uma classe não pode ser final e non-sealed ao mesmo tempo.
final significa que não pode ter subclasses, enquanto non-sealed significa que permite subclasses.
São modificadores contraditórios.

✅ Correção possível:

```java
non-sealed class Book extends DocType { }
// ou
final class Book extends DocType { } // sem o non-sealed
```


✅ Tipos que compilam corretamente
Readable: Interface simples, válida.

DocType: Classe sealed com permits, válida.

Journal: Classe final válida como subtipo permitido.

📘 Regras importantes envolvidas
Uma classe só pode ser non-sealed se herdar de um tipo sealed.

Não é permitido misturar final com non-sealed.

Tipos permitidos por sealed devem ser sealed, non-sealed ou final.

Interfaces normais (não-sealed) não requerem modificadores especiais.