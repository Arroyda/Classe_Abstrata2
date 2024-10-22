// Classe ProdutoVestuario
class ProdutoVestuario extends Produto {
    private String tamanho;
    private String cor;
    private String material;

    public ProdutoVestuario(String nome, double precoCusto, double precoVenda, String tamanho, String cor, String material) {
        super(nome, precoCusto, precoVenda);
        this.tamanho = tamanho;
        this.cor = cor;
        this.material = material;
    }

    @Override
    public void salvar() {
        // Simulação de salvar no banco de dados
        System.out.println("Produto Vestuário salvo: " + nome);
    }

    @Override
    public void deletar() {
        // Simulação de deletar do banco de dados
        System.out.println("Produto Vestuário deletado: " + nome);
    }

    @Override
    public void atualizar() {
        // Simulação de atualizar no banco de dados
        System.out.println("Produto Vestuário atualizado: " + nome);
    }
}