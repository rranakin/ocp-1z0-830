package sealed.q3.java;

sealed class DocType implements Readable permits Book, Journal { }
