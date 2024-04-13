/* Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo". */

import java.util.Scanner;

public class VerificadorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        
        double numero = scanner.nextDouble();
        
        if (numero > 0) {
            System.out.println("Número positivo");
        } else if (numero < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("O número é zero, nem positivo nem negativo.");
        }

        scanner.close();
    }
}
