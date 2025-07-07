## 💡 Introdução

Os `records` foram introduzidos no Java 14 como preview e estabilizados no **Java 16**, com o objetivo de facilitar a criação de **classes imutáveis e transparentes** para representar dados agregados.

Eles eliminam a necessidade de escrever manualmente os métodos `constructor`, `equals`, `hashCode` e `toString`, além de garantir que os campos sejam **privados e finais** automaticamente.

Ele gera automaticamente:

- Construtor canônico (com os parâmetros dos campos)
- Métodos `equals`, `hashCode` e `toString`
- Métodos acessores (`accessors`) públicos

---
