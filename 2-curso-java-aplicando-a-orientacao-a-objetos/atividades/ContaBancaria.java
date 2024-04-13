public class ContaBancaria {
    protected double saldo;

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de " + valor + " realizado. Saldo atual: " + saldo);
    }

    public void sacar(double valor) {
        if(valor <= this.saldo) {
            this.saldo -= valor;
            
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
}
