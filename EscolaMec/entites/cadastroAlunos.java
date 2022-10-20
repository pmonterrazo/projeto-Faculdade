package Projeto_Faculdade.EscolaMec.entites;

public class cadastroAlunos {

    // atributos

    private String nome;
    private float nota1;
    private float nota2;
    private float nota3;
    static String disciplina = "POO";

    // Construtores

    public cadastroAlunos() {
    } // default

    // Sobrecargado

    public cadastroAlunos(String nome, float nota1, float nota2, float nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    // Metodos de acessos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float MediaAluno() {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Metodos para retornar a situação do Aluno

    static String resultadoAluno() {
        double media = 0;

        if (media >= 6) {
            String aprovado = "Aprovado";
            return aprovado;
        } else if (media < 6 && media >= 4) {
            String recuperacao = "Em Recuperacao";
            return recuperacao;
        } else {
            String reprovado = "Reprovado";
            return reprovado;
        }

    }

    // Metodos para retornar o relatorio para o Aluno

    public String relatorio() {
        return "Nome: " + nome + "\nNota N1: " + nota1 + "\nNota N2: " + nota2 +
                "\nNota N3: " + nota3 + "\nMediaAluno: " + MediaAluno() + "\nSituação: " + resultadoAluno();
    }

}