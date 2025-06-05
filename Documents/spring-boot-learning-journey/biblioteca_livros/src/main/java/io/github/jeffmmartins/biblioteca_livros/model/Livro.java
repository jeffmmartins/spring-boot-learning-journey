package io.github.jeffmmartins.biblioteca_livros.model;

public class Livro {
    private int id;
    private String nome;
    private String autor;
    private String anoPublicado;

    public Livro(int id, String nome, String autor, String anoPublicado) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.anoPublicado = anoPublicado;
    }

    public int getId(){
        return id;
    }

    public void setid(){
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnoPublicado() {
        return anoPublicado;
    }

    public void setAnoPublicado(String anoPublicado) {
        this.anoPublicado = anoPublicado;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id:" + id + " " +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicado='" + anoPublicado + '\'' +
                '}';
    }
}
