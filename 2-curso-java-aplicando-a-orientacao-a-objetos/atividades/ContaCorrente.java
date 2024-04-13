public class ContaCorrente extends ContaBancaria{
    private double tarifaMensal = 5;

    public void cobrarTarifaMensal() {
        this.saldo -= tarifaMensal;
        System.out.println("Tarifa mensal de " + tarifaMensal + " cobrada. Saldo atual: " + saldo);
    }
}
