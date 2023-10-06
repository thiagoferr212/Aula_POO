package Questao_2_DistribuicaoAlimento;

class TrabalhoVoluntario {
    private String tipoTrabalho;
    private int duracaoTrabalho;

    public TrabalhoVoluntario(String tipoTrabalho, int duracaoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public boolean validaProjeto(String nomeProjeto) {
        return duracaoTrabalho > 2;
    }

    public String imprimeProjeto(Projeto projeto) {
        return "Nome do Projeto: " + projeto.getNomeProjeto() +
                "\nDescrição: " + projeto.getDescricao() +
                "\nData de Início: " + projeto.getDatainicio() +
                "\nData de Término: " + projeto.getDatafim() +
                "\nTipo de Trabalho: " + tipoTrabalho +
                "\nDuração do Trabalho: " + duracaoTrabalho;
    }
}
