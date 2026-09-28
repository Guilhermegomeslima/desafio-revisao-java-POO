public class Programa {
   public static void main(String[] args){
   
      Produto produto1 = new Produto("Arroz Codisul 5kg", 1001, 24.99, Produto.CategoriaProduto.ALIMENTO);
      Produto produto2 = new Produto("Cachaça Corote 500ml", 1002, 11.99, Produto.CategoriaProduto.BEBIDA);
      ProdutoPerecivel produto3 = new ProdutoPerecivel("Iogurte natural integral Danone 160g", 1003, 4.49, Produto.CategoriaProduto.BEBIDA, "15/12/2026", 4.0);
      
      System.out.println("Produto 1: ");
      produto1.obterDetalhes();
      System.out.printf("Desconto: R$ %.2f%n", produto1.calcularDesconto());
      System.out.printf("Preco final: R$ %.2f%n", produto1.getPreco() - produto1.calcularDesconto());
      System.out.println();
      
      System.out.println("Produto 2: ");
      produto2.obterDetalhes();
      System.out.printf("Desconto: R$ %.2f%n", produto2.calcularDesconto());
      System.out.printf("Preco final: R$ %.2f%n", produto2.getPreco() - produto2.calcularDesconto());
      System.out.println();

      System.out.println("Produto 3: ");
      produto3.obterDetalhes();
      System.out.printf("Desconto: R$ %.2f%n", produto3.calcularDesconto());
      System.out.printf("Preco final: R$ %.2f%n", produto3.getPreco() - produto3.calcularDesconto());
      System.out.println();
   }
}