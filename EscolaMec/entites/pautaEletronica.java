package Projeto_Faculdade.EscolaMec.entites;

import java.util.ArrayList;

public class pautaEletronica extends cadastroAlunos {

    private static ArrayList<cadastroAlunos> alunos = new ArrayList<>();

    // Metodo GET
    public static ArrayList<cadastroAlunos> getAlunos() {
        return alunos;
    }

    // Adicionar objeto Aluno na lista
    static public void adicionarAlunos(cadastroAlunos ca) {
        alunos.add(ca);
    }

    // Metodo para para adicionar aluno
    static public void adicionarNotaAlunos(cadastroAlunos ca) {
        alunos.add(ca);
    }

    // Lista todos os alunos da lista
    static public String listar() {
        String saida = "";
        int i = 1;
        for (cadastroAlunos ca : alunos) {
            saida += "\n============= ALUNO | MATRICULA : " + (i++) + "=============\n";
            saida += ca.relatorio() + "\n";
        }

        return saida;
    }

    // Pesquisar por aluno
    static public int pesquisar(String aluno) {
        int qtd = 0;

        for (cadastroAlunos ca : alunos) {
            if (ca.getNome().equalsIgnoreCase(aluno)) { // versão do equalsIgnoreCase para ignorar maisculo ou minusculo
                qtd++;
            }
        }

        return qtd;
    }

    // Remover o aluno selecionado
    static public boolean removerAluno(String aluno) {
        for (cadastroAlunos ca : alunos) {
            if (ca.getNome().equalsIgnoreCase(aluno)) {
                alunos.remove(ca);
                return true;
            }
        }
        return false;
    }

    // Calcular a Media Aluno
    static double calcularMediaAluno() {
        double media = 0;

        for (cadastroAlunos ca : alunos) {
            media = (ca.getNota1() + ca.getNota2() + ca.getNota3()) / 3;
        }

        return media;
    }

}
