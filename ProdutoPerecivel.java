public class ProdutoPerecivel extends Produto{
   private String dataValidade;
   private double temperaturaArmazenamento;
   
   public ProdutoPerecivel(String nome, int codigo, double preco, CategoriaProduto categoria, String dataValidade, double temperaturaArmazenamento){
      
      super(nome, codigo, preco, categoria);
      this.dataValidade = dataValidade;
      this.temperaturaArmazenamento = temperaturaArmazenamento;
   }
   
   @Override
   public double calcularDesconto(){
      return getPreco() * 0.20;
   }
}