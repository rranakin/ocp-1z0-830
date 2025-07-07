package records.q2.java;

public class RecordTest {
    public static void main(String[] args) {
        Produto p1 = new Produto("Café", 10.0);
        Produto p2 = new Produto("Água"); // preco será 0.0
        Produto p3 = new Produto();       // nome: "Desconhecido", preco: 1.0
        //Produto p4 = new Produto("Coca Cola", -1.0);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        //System.out.println(p4);
        System.out.println("✅ Record com múltiplos construtores executado com sucesso!");
    }
}
