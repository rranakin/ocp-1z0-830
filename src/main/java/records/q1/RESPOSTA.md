## ✅ Resposta Correta

As alternativas corretas são:

- ✅ **1. Records são implicitamente final.**
- ✅ **2. Todas as classes record aninhadas são implicitamente static.**
- ✅ **5. As instâncias de um record são imutáveis.**

---

## 💡 Explicação

## 📘 Regras principais dos Records

1. Um record é implicitamente `final`, não pode ser estendido.
2. O tipo pai de um record é sempre `java.lang.Record`.
3. Classes `record` aninhadas são `static` por padrão.
4. Os campos declarados são `private final` e recebem métodos `accessors` automaticamente.
5. Você pode declarar construtores personalizados, mas deve chamar o canônico (implícito ou explícito).
6. Um record não pode ser:
    - `abstract`, `sealed` ou `non-sealed`
    - `generic`
    - conter inicializadores de instância ou estáticos (exceto blocos `static`)
    - declarar métodos como `clone`, `finalize`, `wait`, `notify`, `notifyAll`
7. A imutabilidade é rasa (shallow): os campos não podem ser reatribuídos, mas os objetos referenciados podem ser mutáveis.

---

## ⚠️ Observações importantes

- Apesar de os campos serem `final`, a **imutabilidade** se aplica apenas às referências, não aos objetos referenciados.
- `records` não são `sealed`, pois não aceitam subtipos — já são `final`.
- A quantidade de instâncias não é restringida por padrão — ou seja, a **opção 3 está incorreta**.

