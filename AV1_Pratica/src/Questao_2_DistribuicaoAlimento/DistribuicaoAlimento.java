package Questao_2_DistribuicaoAlimento;

class DistribuicaoAlimento {
    private String descAlimento;
    private float qtde;

    public DistribuicaoAlimento(String descAlimento, float qtde) {
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    public boolean validaProjeto(String nomeProjeto) {
        return nomeProjeto != null && nomeProjeto.isEmpty();
    }

    public String imprimeProjeto(Projeto projeto) {
        return "Nome do Projeto: " + projeto.getNomeProjeto() +
                "\nDescrição: " + projeto.getDescricao() +
                "\nData de Início: " + projeto.getDatainicio() +
                "\nData de Término: " + projeto.getDatafim() +
                "\nDescrição do Alimento: " + descAlimento +
                "\nQuantidade de Alimento: " + qtde;
    }
}
