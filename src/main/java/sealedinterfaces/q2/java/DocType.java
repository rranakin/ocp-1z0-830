package sealedinterfaces.q2.java;

public sealed abstract class DocType permits Pdf, Doc {
    public abstract String descricao();
}
