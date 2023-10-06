package Questao_1_AchadoPerdido;

public class Encontrar {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("João", "joao@email.com", "senha123");


        AchadoPerdido publicacao = new AchadoPerdido("Chave encontrada", "Chave de casa", "Achado", "Disponível");
        publicacao.completaDados("chave.jpg", "Praça central", "2023-10-05 10:00:00");


        String resultadoBusca = publicacao.buscarTitulo("Chave encontrada");
        System.out.println(resultadoBusca);

        publicacao.visualizarDetalhes();
    }
}
