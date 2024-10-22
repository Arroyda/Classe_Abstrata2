// Classe ProdutoAlimenticio
class ProdutoAlimenticio extends Produto {
    private String dataValidade;
    private String informacoesNutricionais;

    public ProdutoAlimenticio(String nome, double precoCusto, double precoVenda, String dataValidade, String informacoesNutricionais) {
        super(nome, precoCusto, precoVenda);
        this.dataValidade = dataValidade;
        this.informacoesNutricionais = informacoesNutricionais;
    }

    @Override
    public void salvar() {
        // Simulação de salvar no banco de dados
        System.out.println("Produto Alimentício salvo: " + nome);
    }

    @Override
    public void deletar() {
        // Simulação de deletar do banco de dados
        System.out.println("Produto Alimentício deletado: " + nome);
    }

    @Override
    public void atualizar() {
        // Simulação de atualizar no banco de dados
        System.out.println("Produto Alimentício atualizado: " + nome);
    }
}