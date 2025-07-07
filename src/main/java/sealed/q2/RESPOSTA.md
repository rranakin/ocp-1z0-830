## ✅ Respostas Corretas

As alternativas corretas são:

- ✅ **1. `public abstract sealed class DocType {}`**
- ✅ **2. `public sealed class DocType {}`**
- ✅ **3. `public abstract sealed class DocType permits Pdf, Doc {}`**
- ✅ **4. `public sealed class DocType implements Readable permits Pdf, Doc {}`**

---

## ❌ Alternativa Incorreta

- ❌ **5. `final sealed class DocType permits Pdf, Doc {}`**  
  Uma classe `sealed` **nunca pode ser `final`**, pois o objetivo é permitir **um grupo controlado de subclasses**, enquanto `final` **impede completamente a herança**.



## ✅ Regras para `sealed classes`

1. Uma classe `sealed` **deve declarar** explicitamente quem pode herdá-la, com a cláusula `permits`.
2. Os tipos listados no `permits` devem:
    - Estar no **mesmo arquivo fonte** ou ser acessíveis no classpath,
    - Ser marcados como `sealed`, `non-sealed` ou `final`.
3. Se todas as subclasses estiverem no **mesmo arquivo**, a cláusula `permits` pode ser omitida.
4. É possível combinar com `abstract`, `implements` e `permits`, desde que a **ordem dos modificadores** esteja correta:
5. Exemplo válido:
```java
   public abstract sealed class A implements Interface permits B, C { }
```
