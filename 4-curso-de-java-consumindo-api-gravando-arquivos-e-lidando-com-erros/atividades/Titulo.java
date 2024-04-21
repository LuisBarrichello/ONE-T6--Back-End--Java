class Titulo {
    private String nome;
    private String autor;
    private int anoPublicacao;

    // Construtor
    public Titulo(String nome, String autor, int anoPublicacao) {
        this.nome = nome;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    // Getters e Setters
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

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
