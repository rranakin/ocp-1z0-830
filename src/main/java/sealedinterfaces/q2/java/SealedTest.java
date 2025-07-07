package sealedinterfaces.q2.java;

public class SealedTest {
    public static void main(String[] args) {
        DocType pdf = new Pdf();
        DocType doc = new Doc();

        System.out.println(pdf.descricao()); // Documento PDF
        System.out.println(doc.descricao()); // Documento Word

        System.out.println("✅ Sealed class executada com sucesso!");
    }
}
