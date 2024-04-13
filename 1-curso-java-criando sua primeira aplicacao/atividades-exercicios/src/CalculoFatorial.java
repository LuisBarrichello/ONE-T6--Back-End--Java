import java.util.Scanner;

public class CalculoFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo para calcular o fatorial: ");

        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("O número deve ser um inteiro positivo.");
        } else {
            long fatorial = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        scanner.close();
    }

    private static long calcularFatorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        } else {
            long fatorial = 1;
            for (int i = 2; i <= n; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }
}
