public class ProdutoPerecivel extends Produto{
   private String dataValidade;
   private double temperaturaArmazenamento;
   
   public ProdutoPerecivel(){
      super();
   }
   
   public ProdutoPerecivel(String nome, int codigo, double preco, CategoriaProduto categoria, String dataValidade, double temperaturaArmazenamento){
      
      super(nome, codigo, preco, categoria);
      this.dataValidade = dataValidade;
      this.temperaturaArmazenamento = temperaturaArmazenamento;
   }
   
   public String getDataValidade(){
      return dataValidade;
   }
   
   public void setDataValidade(String dataValidade){
      this.dataValidade = dataValidade;
   }
   
   public double getTemperaturaArmazenamento(){
      return temperaturaArmazenamento;
   }
   
   public void setTemperaturaArmazenamento(double temperaturaArmazenamento){
      this.temperaturaArmazenamento = temperaturaArmazenamento;
   }
   
   @Override
   public double calcularDesconto(){
      return getPreco() * 0.20;
   }
}