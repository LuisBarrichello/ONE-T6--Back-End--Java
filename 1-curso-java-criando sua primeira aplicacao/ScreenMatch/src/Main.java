public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022; // inteiro
        // class sempre com letra maiuscula e variaveis inicio minusculo
        System.out.println("Ano de lançamento: " + anoDeLancamento); // contenação

        boolean incluidoNoPlano = false;
        if (incluidoNoPlano == false) {
            System.out.println("Plus não incluido no plano"); // contenação
        }

        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        String sinopse;
        sinopse = """
            Filme: Top Gun: Maverick
            Filme de ventura
            ------------
            Ano de Lançamento:
            """ + anoDeLancamento;
        System.out.println(sinopse);


        int classificacao = (int) (media / 2);
        System.out.println(classificacao);

    }
}