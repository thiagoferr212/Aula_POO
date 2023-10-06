package Questao_1_AchadoPerdido;

import javax.swing.JOptionPane;

interface Publicacao {
    String buscarTitulo(String titulo);

    default void visualizarDetalhes() {

    }
}
