package records.q1.java;

public class RecordTest {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João", 30);
        Pessoa p2 = new Pessoa("João", 30);

        System.out.println(p1.nome()); // João
        System.out.println(p1.idade()); // 30
        System.out.println(p1); // Pessoa[nome=João, idade=30]
        System.out.println(p1.equals(p2)); // true

        // p1.nome = "Maria"; // ERRO: campo é final (imutável)
        System.out.println("✅ Record executado com sucesso!");
    }
}
