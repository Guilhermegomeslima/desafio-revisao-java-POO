public class Produto{
   private String nome;
   private int codigo;
   private double preco;
   private CategoriaProduto categoria;
  
  public enum CategoriaProduto{
   ALIMENTO,
   BEBIDA,
   HIGIENE,
   LIMPEZA
  }
  
  public Produto(String nome, int codigo, double preco, CategoriaProduto categoria){
   this.nome = nome;
   this.codigo = codigo;
   this.preco = preco;
   this.categoria = categoria;
  }
  
}
