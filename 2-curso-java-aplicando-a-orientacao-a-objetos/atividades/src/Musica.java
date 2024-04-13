public class Musica {
    private String titulo;
    private String artista;
    private int anoLancamento;
    private double avaliacao;
    private int numAvaliacoes;

    public Musica(String titulo, String artista, int anoLancamento) {
        this.titulo = titulo;
        this.artista = artista;
        this.anoLancamento = anoLancamento;
        this.avaliacao = 0.0; // Inicializa a avaliação como 0
        this.numAvaliacoes = 0; // Inicializa o número de avaliações como 0
    }

    public void exibirFichaTecnica() {
        System.out.println("Ficha Técnica:");
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Avaliação Média: " + avaliacao);
    }

    public void avaliar(double nota) {
        // Verifica se a nota está dentro do intervalo válido (0 a 10)
        if (nota >= 0 && nota <= 10) {
            // Atualiza a avaliação média e o número de avaliações
            avaliacao = (avaliacao * numAvaliacoes + nota) / (numAvaliacoes + 1);
            numAvaliacoes++;
            System.out.println("Avaliação registrada com sucesso!");
        } else {
            System.out.println("A nota deve estar no intervalo de 0 a 10.");
        }
    }

    public double calcularMediaAvaliacoes() {
        return avaliacao;
    }

    public static void main(String[] args) {
        // Criando uma instância da classe Musica
        Musica musica = new Musica("Bohemian Rhapsody", "Queen", 1975);

        // Exibindo a ficha técnica
        musica.exibirFichaTecnica();

        // Avaliando a música
        musica.avaliar(9.5);
        musica.avaliar(8.0);
        musica.avaliar(7.5);

        // Exibindo a ficha técnica atualizada
        musica.exibirFichaTecnica();
    }

}
