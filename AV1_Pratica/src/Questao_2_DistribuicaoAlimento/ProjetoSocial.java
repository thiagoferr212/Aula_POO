package Questao_2_DistribuicaoAlimento;

import javax.swing.JOptionPane;

public class ProjetoSocial {
    public static void main(String[] args) {
        while (true) {
            String userInput = JOptionPane.showInputDialog("Escolha uma opção:\n1- Distribuição de Alimentos\n2- Trabalho Voluntário\n3- Sair");

            if (userInput == null || userInput.equals("3")) {
                // Sair do programa
                break;
            }

            switch (userInput) {
                case "1":
                    // Opção de Distribuição de Alimentos
                    String nomeProjeto = JOptionPane.showInputDialog("Digite o nome do projeto:");
                    Projeto projeto1 = new Projeto(nomeProjeto, "Descrição do Projeto 1", "Endereço do Projeto 1", "01/01/2023", "");
                    DistribuicaoAlimento distribuicaoAlimento = new DistribuicaoAlimento("Comida", 100);
                    boolean projetoValido1 = distribuicaoAlimento.validaProjeto(nomeProjeto);
                    String mensagem1 = distribuicaoAlimento.imprimeProjeto(projeto1);

                    JOptionPane.showMessageDialog(null, "Projeto é válido: " + projetoValido1 + "\n\n" + mensagem1);
                    break;

                case "2":
                    // Opção de Trabalho Voluntário
                    nomeProjeto = JOptionPane.showInputDialog("Digite o nome do projeto:");
                    Projeto projeto2 = new Projeto(nomeProjeto, "Descrição do Projeto 2", "Endereço do Projeto 2", "01/01/2023", "31/12/2023");
                    TrabalhoVoluntario trabalhoVoluntario = new TrabalhoVoluntario("Apoio", 3);
                    boolean projetoValido2 = trabalhoVoluntario.validaProjeto(nomeProjeto);
                    String mensagem2 = trabalhoVoluntario.imprimeProjeto(projeto2);

                    JOptionPane.showMessageDialog(null, "Projeto é válido: " + projetoValido2 + "\n\n" + mensagem2);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        }
    }
}
