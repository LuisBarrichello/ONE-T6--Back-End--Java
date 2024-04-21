public class ProdutoPerecivel extends Produto{
    String dataValidade; 
    
    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }
}
