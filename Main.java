// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        ProdutoAlimenticio produtoAlimenticio = new ProdutoAlimenticio("Maçã", 1.00, 2.00, "2024-12-31", "Nutritiva");
        produtoAlimenticio.salvar();
        System.out.println("Lucro: " + produtoAlimenticio.calcularLucro());
        produtoAlimenticio.atualizar();
        produtoAlimenticio.deletar();

        ProdutoVestuario produtoVestuario = new ProdutoVestuario("Camiseta", 15.00, 30.00, "M", "Azul", "Algodão");
        produtoVestuario.salvar();
        System.out.println("Lucro: " + produtoVestuario.calcularLucro());
        produtoVestuario.atualizar();
        produtoVestuario.deletar();
    }
}