## ✅ Resposta Correta

**Alternativa 4:**  
✅ *"A record may have any number of overloaded constructors."*  
📌 *Um record pode ter qualquer número de construtores sobrecarregados.*

---

## 💡 Explicação

### 🔧 Construtores em records

#### ✅ Tipos permitidos:

1. **Construtor Canônico**
    - Possui a mesma lista de parâmetros definida no cabeçalho do record.
    - Pode ser definido de forma "normal" ou na forma **compacta** (sem parâmetros explícitos).

2. **Construtores Sobrecaregados (overloaded)**
    - Podem ter **qualquer lista de parâmetros diferente** da canônica.
    - **Devem obrigatoriamente chamar outro construtor** (geralmente o canônico) como primeira linha.

---

### ⚠️ Regras importantes

- Só pode haver **um construtor canônico**.
- Construtores sobrecarregados são permitidos **em qualquer quantidade**.
- Construtores sobrecarregados **não substituem** o canônico.
- Se não declarado manualmente, o compilador **gera automaticamente** o canônico.
- O construtor canônico **não pode conter `throws` clause**.
- Construtores não-canônicos **podem conter `throws`**.

---
