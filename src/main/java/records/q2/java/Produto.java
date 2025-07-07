package records.q2.java;

public record Produto(String nome, double preco) {

    // Construtor compacto (canônico)
    public Produto {
        if (preco < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo");
        }
    }

    // Construtor sobrecarregado com apenas o nome
    public Produto(String nome) {
        this(nome, 0.0); // chama o canônico
    }

    // Construtor sobrecarregado com nome e preço padrão
    public Produto() {
        this("Desconhecido", 1.0); // chama o canônico
    }
}
