## ✅ Respostas Corretas
✅ "The code will compile fine if both A and B are part of the same named module."

✅ "Class B will compile if, instead of final, it is made non-sealed."

## 💡 Explicação
🧩 Sobre sealed class e subtipos
Para que uma classe sealed funcione corretamente, os subtipos declarados na cláusula permits devem obedecer a algumas regras:

🔷 Regras básicas:
Se a sealed class estiver em um módulo nomeado (module-info.java), os subtipos devem:

Estar no mesmo módulo nomeado, ou

Estar no mesmo pacote que a classe sealed.

Se não houver módulo nomeado, os subtipos devem obrigatoriamente estar no mesmo pacote da classe sealed.

❌ Por que o código original falha?
A classe A está no pacote p1, enquanto B está em p2.

A permite p2.B, mas o compilador exige que:

Ou ambas estejam no mesmo pacote (sem módulo),

Ou ambas estejam no mesmo módulo nomeado (com module-info.java visível).

⚠️ E o modificador final?
```java
public final non-sealed class B extends A { } // ERRADO!
```
Isso é inválido, pois uma classe não pode ser ao mesmo tempo final e non-sealed — são contraditórios.

Uma subclasse de uma sealed class deve ser:

sealed, ou

non-sealed, ou

final — mas somente um deles.

✅ Correto:

```java
public non-sealed class B extends A { } // OU
public final class B extends A { }      // Mas não ambos
```