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
  
  public String getNome(){
   return nome;
  }
  
  public void setNome(String nome){
   this.nome = nome;
  }
  
  public int getCodigo(){
   return codigo;
  }
  
  public void setCodigo(int codigo){
   this.codigo = codigo;
  }

  public double getPreco(){
   return preco;
  }
  
  public void setPreco(double preco){
   this.preco = preco;
  }
  
  public CategoriaProduto getCategoria(){
   return categoria;
  }
  
  public void setCategoria(CategoriaProduto categoria){
   this.categoria = categoria;
  }
  
  public double calcularDesconto(){
   return this.preco * 0.10;
  }
}
