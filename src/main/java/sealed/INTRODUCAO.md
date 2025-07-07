# 📘 Introdução às Sealed Classes e Interfaces em Java

## 🔍 O que são Sealed Classes e Interfaces?

As *sealed classes* e *sealed interfaces* são um recurso introduzido no **Java 15 (como preview)** e **estabilizado no Java 17**, que permite ao desenvolvedor **restringir quais classes ou interfaces podem estendê-las ou implementá-las**.

## 🎯 Por que foram criadas?

Antes desse recurso, qualquer classe pública ou protegida podia ser estendida livremente, o que dificultava:

- o controle sobre herança,
- a segurança em APIs públicas,
- a manutenção e evolução de bibliotecas grandes,
- e a implementação de lógica de decisão mais segura (como `switch` com selamento completo de tipos).

As *sealed classes/interfaces* resolvem isso ao permitir declarar explicitamente **quem pode herdar ou implementar** uma hierarquia.

## ✅ Problemas que elas resolvem

- Evitam heranças não intencionais.
- Tornam o código mais seguro e previsível.
- Facilitam o uso de `instanceof + pattern matching` e `switch` com tipos exaustivos.
- Melhoram a legibilidade e design de APIs, como no estilo “algebraic data types”.

## 📌 Quando usar

Use *sealed types* quando:

- Você quer **controlar** quem pode estender ou implementar uma classe ou interface.
- Você está criando **modelos fechados**, como árvores sintáticas, estados finitos ou enums com comportamento.
- Você deseja reforçar **segurança e imutabilidade** em bibliotecas públicas.

## 🚫 Quando evitar

Evite usar quando:

- A hierarquia deve ser extensível por qualquer consumidor externo.
- O controle rígido de herança não traz benefício prático.
- Pode causar confusão desnecessária em projetos simples.

## ⚙️ Regras principais

1. Uma `sealed class` ou `sealed interface` **deve usar o modificador** `sealed`.
2. Ela **deve declarar explicitamente** quais subtipos são permitidos com `permits`.
3. Cada subtipo permitido deve ser declarado como:
    - `sealed` (continua restringindo),
    - `non-sealed` (abre herança novamente), ou
    - `final` (não pode ser mais estendido).
4. Subtipos devem estar no **mesmo arquivo fonte** ou ser acessíveis no mesmo módulo/package.
5. Interfaces não podem ser `final`, mas devem ser `sealed` ou `non-sealed`.

---

📎 *Esse recurso ajuda a criar código mais seguro, previsível e fácil de manter — especialmente útil em domínios fechados ou APIs de bibliotecas.*
