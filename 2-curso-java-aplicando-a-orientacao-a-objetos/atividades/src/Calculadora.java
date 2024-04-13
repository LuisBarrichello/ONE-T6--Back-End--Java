public class Calculadora {
    public int dobro(int numero) {
        return numero * 2;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int numero = 5;
        int resultado = calc.dobro(numero);
        System.out.println("O dobro de " + numero + " é " + resultado);
    }
}