import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Sabão", 15.99, 5);
        Produto produto2 = new Produto("Detergente", 10.49, 8);
    
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);

        System.out.println("Tamanho da Lista: " + listaDeProdutos.size());
        System.out.println("Produto: " + listaDeProdutos.get(1).getNome());

        for (Produto produto : listaDeProdutos) {
            System.out.println(produto);
        }

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Produto C", 12.75, 2, "2023-12-31");
        System.out.println(produtoPerecivel);


        ArrayList<String> listaStrings = new ArrayList<>();
        listaStrings.add("Java");
        listaStrings.add("C++");
        listaStrings.add("Javascript");
        listaStrings.add("Python");

        for (String elemento : listaStrings) {
            System.out.println(elemento);
        }


        Cachorro cachorro = new Cachorro();
        Animal animal = (Animal) cachorro;
        
        Cachorro cachorro1 = new Cachorro();
        Animal animal1 = new Cachorro();
        if (animal1 instanceof Cachorro) {
            cachorro1 = (Cachorro) animal1;
            // Agora você pode usar o objeto 'cachorro' como um Cachorro.
        } else {
            System.out.println("O objeto não é um Cachorro.");
        }



        Produto1 produto1_1 = new Produto1("Ar condicionado", 2000.0);
        Produto1 produto2_2 = new Produto1("Aquecedor", 800.0);
        Produto1 produto3_3 = new Produto1("Ventilador", 150.0);

        ArrayList<Produto1> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1_1);
        listaProdutos.add(produto2_2);
        listaProdutos.add(produto3_3);

        double somaPrecos = 0;
        for (Produto1 produto : listaProdutos) {
            somaPrecos += produto.getPreco();
        }

        double precoMedio = somaPrecos / listaProdutos.size();
        System.out.println("Preço médio dos produtos: " + precoMedio);



        Circulo circulo = new Circulo();
        circulo.raio = 5;

        Quadrado quadrado = new Quadrado();
        quadrado.lado = 4;

        // Lista de formas
        ArrayList<Forma> listaFormas = new ArrayList<>();
        listaFormas.add(circulo);
        listaFormas.add(quadrado);

        // Calcular e imprimir a área de cada forma
        for (Forma forma : listaFormas) {
            System.out.println("Área: " + forma.calcularArea());
        }




        ContaBancaria conta1 = new ContaBancaria(101, 1500.0);
        ContaBancaria conta2 = new ContaBancaria(102, 2500.0);
        ContaBancaria conta3 = new ContaBancaria(103, 1800.0);

        ArrayList<ContaBancaria> listaContas = new ArrayList<>();
        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);

        ContaBancaria contaMaiorSaldo = listaContas.get(0);
        for (ContaBancaria conta : listaContas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }

        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumeroConta() +
                ", Saldo: " + contaMaiorSaldo.getSaldo());
    }
}
