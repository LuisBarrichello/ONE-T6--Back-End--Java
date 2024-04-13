/* Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem. */

public class Concatenacao  {
    public static void main(String[] args) {
        char letra = 'A';
        String palavra = "bola";

        String mensagem = "A letra é " + letra + " e a palavra é " + palavra;

        System.out.println(mensagem);
    }
}
