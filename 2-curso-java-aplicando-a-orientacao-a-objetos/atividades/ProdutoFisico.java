public class ProdutoFisico extends Produto implements Calculavel {
    @Override
    public double calcularPrecoFinal() {
        // Implementação com taxas adicionais para produtos físicos
        return preco * 1.05; 
    }
}
