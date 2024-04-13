/* Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado. */

import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
    public static void main(String[] args) {
        int counterAttempts = 5;
        int limitedGeneratedNumber = 5;
        int generatedNumber = new Random().nextInt(limitedGeneratedNumber);
        Scanner number = new Scanner(System.in);
        
        while (counterAttempts >= 1) {
            System.out.println("Tente advinha número gerado até " + limitedGeneratedNumber);
            int inputGuessing = number.nextInt();


            if(inputGuessing == generatedNumber) {
                System.out.println("Você acertou, parabens!!");
                break;
            } else if(counterAttempts == 1) {
                System.out.println("Não foi dessa vez!");
                counterAttempts--;
            } else {
                System.out.println("Tente novamente, você tem mais " + (counterAttempts - 1) + " tentativas");
                counterAttempts--;
            }
        }
    }
    
}
