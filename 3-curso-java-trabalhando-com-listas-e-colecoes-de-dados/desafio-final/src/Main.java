import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double limite = solicitarLimiteCartao(scanner);
        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(limite);

        int statusDasCompras = 1;
        while(statusDasCompras != 0) {
            System.out.println("Digite a descricao da compra: ");
            String descricao = scanner.next();

            double valorDaCompra = solicitarValorCompra(scanner);

            Compra compra = new Compra(descricao, valorDaCompra);
            boolean compraRealizada = cartaoDeCredito.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para SAIR e 1 para continuar comprando");
                statusDasCompras = scanner.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                statusDasCompras = 0;
            }
        }

        Collections.sort(cartaoDeCredito.getCompras());
        System.out.println("********************************");
        System.out.println("Compras realizadas: ");

        for (Compra compra: cartaoDeCredito.getCompras()) {
            System.out.println(compra.getDescricao() + " - " + compra.getValor());
        }

        System.out.println("********************************");

        System.out.println("Saldo do cartão de crédito: " + cartaoDeCredito.getSaldo());
    }

    private static double solicitarLimiteCartao(Scanner scanner) {
        double limite = 0;
        boolean entradaValida = false;
        while(!entradaValida) {
            try {
                System.out.println("Digite o limite do cartão: ");
                limite = scanner.nextDouble();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, digite um número válido para o limite.");
                scanner.next();
            }
        }
        return limite;
    }

    private static double solicitarValorCompra(Scanner scanner) {
        double valor = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                System.out.println("Digite o valor da compra:");
                valor = scanner.nextDouble();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, digite um número válido para o valor da compra.");
                scanner.next(); 
            }
        }
        return valor;
    }
}