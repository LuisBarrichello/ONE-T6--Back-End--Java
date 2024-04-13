import java.util.Scanner;

import javax.swing.text.Style;

public class App {
    public static void main(String[] args) {
        //Initialize customer data
        String name = "Luis";
        String typeAccount = "Corrente";
        double balance = 2150.70;
        int option = 0;

        System.out.println("******************");
        System.out.println("\n Nome do cliente: " + name);
        System.out.println("\n Tipo da conta: " + typeAccount);
        System.out.println("\n Saldo atual: " + balance);
        System.out.println("\n******************");

        Scanner leitura = new Scanner(System.in);
        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor 
                4 - Sair
                
                """;
        while(option != 4) {
            System.out.println(menu);
            option = leitura.nextInt();

            if (option == 1){
                System.out.println("O saldo atualizado é " + balance);
            } else if (option == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double value = leitura.nextDouble();
                if (value > balance) {
                    System.out.println("Não há saldo para realizar a transferência.");
                } else {
                    balance -= value;
                    System.out.println("Novo saldo: " + balance);
                }
            } else if (option == 3) {
                System.out.println("Valor recebido: ");
                double value = leitura.nextDouble();
                balance += value;
                System.out.println("Novo saldo: " + balance);
            } else if (option != 4) {
                System.out.println("Opção inválida!");
            }
        }

        leitura.close();
    }
}