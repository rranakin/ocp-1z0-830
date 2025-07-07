# ✅ Explicação — Quiz Java: Sealed Interfaces

## ✔️ Resposta Correta

**Opção 1:**
```java
non-sealed interface Value extends Cacheable { }
non-sealed interface Result extends Cacheable { }
```

💡 Explicação
No Java, quando você declara uma interface como sealed, é obrigatório listar explicitamente quais classes ou interfaces podem estendê-la usando a cláusula permits. Além disso, todas essas subinterfaces ou subclasses devem ser marcadas com um dos modificadores obrigatórios:

sealed

non-sealed

final (apenas para classes)

🔹 Por que a Opção 1 está correta
A interface Cacheable foi declarada assim:

```java
sealed interface Cacheable permits Value, Result {}
```
Portanto, Value e Result precisam ser explicitamente declaradas com um modificador. Na opção 1, ambas são declaradas como non-sealed, o que é totalmente válido e cumpre a regra de compilação do Java 17 em diante.

🔸 Por que as outras opções estão incorretas
Opção 2:

```java
interface Value extends Cacheable { }
interface Result extends Cacheable { }
```
Essa opção não compila, pois faltam os modificadores obrigatórios (sealed, non-sealed ou final).

Opção 3:
```java
sealed interface Value extends Cacheable { }
sealed interface Result extends Cacheable { }
```
Apesar de usarem sealed, essas interfaces também devem declarar quais tipos podem estendê-las (usando permits) ou estar no mesmo arquivo da interface Cacheable. Como isso não está garantido no enunciado, essa opção pode causar erro de compilação.

Opção 4:
Incorreta, pois a opção 1 compila corretamente.


📘 Regra de Ouro

Sempre que usar sealed, as subclasses ou subinterfaces devem estar listadas no permits e devem ser marcadas com sealed, non-sealed ou final.