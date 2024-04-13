import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Epsodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
  public static void main(String[] args) {
    // Instanciação de objetos
    // tipo por referência, em algum lugar da memória da máquina foi criado um
    // espaço reservado para um objeto chamado br.com.alura.screenmatch.modelos.Filme.
    Filme meuFilme = new Filme();

    meuFilme.setNome("O poderoso chefão");
    meuFilme.setAnoDeLancamento(1970);
    meuFilme.setDuracaoEmMinutos(180);
    System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

    //java doc para documentacao
    //String é uma classe que possue diversos metodos, basta meuFilme.nome. e ira aparecer os metodos mais usados
    //meuFilme.nome.length()

    System.out.println(meuFilme);// br.com.alura.screenmatch.modelos.Filme@372f7a8d - class e referencia

    System.out.println(meuFilme.getNome());
    System.out.println(meuFilme.getAnoDeLancamento());

    // diferença entre classe e o modelo. A partir da classe, que é o modelo,
    // podemos criar diversos filmes, o que inclusive faz parte dos exercícios.

    meuFilme.exibeFichaTecnica();
    meuFilme.avalia(8);
    meuFilme.avalia(10);
    meuFilme.avalia(6);

    System.out.println(meuFilme.getTotalDeAvaliacoes());
    System.out.println(meuFilme.pegaMedia());


    Serie lost = new Serie();
    lost.setNome("Lost");
    lost.setAnoDeLancamento(2000);
    lost.exibeFichaTecnica();
    lost.setTemporadas(10);
    lost.setEpisodiosPorTemporada(10);
    lost.setMinutosPorEpisodio(50);
    System.out.println("Duração do filme: " + lost.getDuracaoEmMinutos());

    Filme outroFilme = new Filme();
    outroFilme.setNome("Avatar");
    outroFilme.setAnoDeLancamento(2023);
    outroFilme.setDuracaoEmMinutos(200);

    CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
    calculadora.inclui(meuFilme);
    calculadora.inclui(outroFilme);
    calculadora.inclui(lost);
    System.out.println(calculadora.getTempoTotal());


    FiltroRecomendacao filtro = new FiltroRecomendacao();
    filtro.filtra(meuFilme);

    Epsodio epsodio = new Epsodio();
    epsodio.setNumero(1);
    epsodio.setSerie(lost);
    epsodio.setTotalDeVisualizacoes(99);
    filtro.filtra(epsodio);
  }
}
