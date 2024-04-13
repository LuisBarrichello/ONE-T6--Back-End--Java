import java.time.LocalDate;

public class Carro {
    private String modelo;
    private int ano;
    private String cor;

    public Carro(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public void exibirFichaTecnica() {
        System.out.println("Ficha Técnica:");
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    public int calcularIdade() {
        int anoAtual = LocalDate.now().getYear();

        int idade = anoAtual - ano;

        return idade;
    }

    public static void main(String[] args) {
        Carro carro = new Carro("Civic", 2018, "Prata");

        carro.exibirFichaTecnica();

        int idade = carro.calcularIdade();
        System.out.println("Idade do Carro: " + idade + " anos");
    }
}
