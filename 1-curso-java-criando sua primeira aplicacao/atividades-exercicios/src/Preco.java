/* Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem. */
public class Preco {
    public static void main(String[] args) {
        double precoProduto = 40.55;
        int quantidade = 12;

        double precoFinal = precoProduto * quantidade;

        System.out.println("Preço dos produtos é: " + precoFinal);
    }
}
