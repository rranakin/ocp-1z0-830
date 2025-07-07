# ☕ Java Quiz — Sealed Classes e Módulos

## 📌 Question (EN)

Given the following code:

```java
// in file A.java
package p1;
public sealed class A permits p2.B { }

// in file B.java
package p2;
public final class B extends p1.A { }
```

Identify correct statements.
You had to select 2 options.

Options:

- The code will compile fine if both A and B are part of the same named module.

- Both the classes must belong to the same package for the code to compile irrespective of whether they belong to the same module or not.

- Both the classes will compile as long as they are packaged in the same jar.

- Class B will compile if, instead of final, it is made non-sealed.




## 📌 Question (PT-BR)

Dado o seguinte código:

```java
// in file A.java
package p1;
public sealed class A permits p2.B { }

// in file B.java
package p2;
public final class B extends p1.A { }
```

Identifique as afirmações corretas.
Você deve selecionar 2 alternativas.

Opções:

- O código irá compilar corretamente se tanto a classe A quanto a classe B fizerem parte do mesmo módulo nomeado.

- Ambas as classes devem pertencer ao mesmo pacote para que o código compile, independentemente de estarem ou não no mesmo módulo.

- Ambas as classes irão compilar desde que estejam empacotadas no mesmo arquivo JAR.

- A classe B irá compilar se, em vez de ser final, ela for declarada como non-sealed.