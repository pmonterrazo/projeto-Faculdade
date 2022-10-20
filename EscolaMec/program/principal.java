package Projeto_Faculdade.EscolaMec.program;

import java.util.Scanner;

import Projeto_Faculdade.EscolaMec.entites.cadastroAlunos;
import Projeto_Faculdade.EscolaMec.entites.pautaEletronica;

public class principal {
    public static void main(String[] args) {

        // Variaveis para armazenamento Local
        int escolha;
        float nota1, nota2, nota3;
        String aluno;

        // Criando o objeto cadAluno baseado na classe CadastroAlunos
        cadastroAlunos cadAluno = new cadastroAlunos();

        Scanner sc = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);

        // Laço de repetição voltado para o Menu

        do {
            exibirMenu();
            escolha = sc.nextInt();

            switch (escolha) {
                case 1: // cadastro do Aluno
                    System.out.println("=====> CADASTRAR ALUNOS =====");
                    System.out.print("Digite o nome do aluno: ");
                    aluno = scString.nextLine();
                    System.out.print("Digite a Nota 1: ");
                    nota1 = sc.nextFloat();
                    System.out.print("Digite a Nota 2: ");
                    nota2 = sc.nextFloat();
                    System.out.print("Digite a Nota 3: ");
                    nota3 = sc.nextFloat();

                    // criar objeto classe
                    cadAluno = new cadastroAlunos(aluno, nota1, nota2, nota3);
                    // guardar na lista
                    pautaEletronica.adicionarAlunos(cadAluno);

                    break;

                case 2:
                    System.out.println("=====> PESQUISAR ALUNO =====");
                    System.out.print("Digite o nome do aluno: ");
                    aluno = scString.nextLine();
                    System.out.println("Aluno: " + pautaEletronica.pesquisar(aluno) + ", Encontrado");
                    break;

                case 3:
                    System.out.println("=====> REMOVER ALUNO =====");
                    System.out.print("Digite o nome do aluno: ");
                    aluno = scString.nextLine();

                    if (!(pautaEletronica.getAlunos().isEmpty())) { // acervo não vazio
                        if (pautaEletronica.removerAluno(aluno)) {
                            System.out.println("Aluno removido com sucesso");
                        } else {
                            System.out.println("Aluno não removido");
                        }
                    } else {
                        System.out.println("Não existe Alunos Cadastrados!");
                    }

                    break;

                case 4:
                    System.out.println("=====> RELATORIO ALUNOS =====");
                    System.out.println(pautaEletronica.listar());
                    break;

                case 5:

                    break;

                default:
                    System.out.println("Opção de menu Inválida");
                    break;

            }
        } while (escolha != 6);

        sc.close();
        scString.close();
    }

    // O esqueleto do menu foi criado fora da Main
    static void exibirMenu() {
        System.out.println("======Menu======");
        System.out.println("1. CADASTRAR ALUNO");
        System.out.println("2. PESQUISAR ALUNO");
        System.out.println("3. EXCLUIR ALUNO");
        System.out.println("4. RELATORIO ALUNOS");
        System.out.println("6. SAIR");
        System.out.println("=================");
        System.out.print("ESCOLHA A OPÇÃO: ");
    }
}
