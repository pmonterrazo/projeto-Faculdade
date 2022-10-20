package Projeto_Faculdade.BancoBrasil.program;

import java.util.Random;
import javax.swing.JOptionPane;
import Projeto_Faculdade.BancoBrasil.entites.conta;

public class principal {
    public static void main(String[] args) {

        int tipoConta;
        int confirmar;
        int escolha;

        conta p1 = new conta();
        Random random = new Random();

        tipoConta = Integer.parseInt(JOptionPane
                .showInputDialog("Informe o tipo de Conta que deseja abrir\n1 - Conta Corrente\n2 - Conta Popança"));
        if (tipoConta == 1) {
            p1.abrirConta("CC");
            nomeExtensoTipoConta = "Conta Corrente";
            statusConta = "Aberta";
        } else if (tipoConta == 2) {
            p1.abrirConta("CP");
            nomeExtensoTipoConta = "Conta Poupança";
            statusConta = "Aberta";
        }

        p1.setNumConta(random.nextInt(1000));
        p1.setDono(JOptionPane.showInputDialog("Informe o seu nome:"));

        JOptionPane.showMessageDialog(null,
                    "=======Bank of Desespero=======\n Olá, " + p1.getDono()
                        + ", Sua Conta foi aberta com Sucesso! \n Num. Conta: " + p1.getNumConta()
                        + "\n Tipo da Conta: " + p1.getTipo() + "\n Status da Conta: " + p1.isStatus();
                        + "\n Saldo atual é de: " + p1.getSaldo());

        escolha = Integer.parseInt(JOptionPane.showInputDialog(
                "Informe o tipo de Operação que deseja fazer:\n1 - Depositar\n2 - Sacar\n3 - Verificar Saldo\n4 - Sair"));

        switch (escolha) {
            case 1:
                float valor;
                valor = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor a ser depositado: "));
                confirmar = JOptionPane.showConfirmDialog(null, "Voce realmente deseja depositar o valor? " + valor);
                if (confirmar == JOptionPane.YES_OPTION) {
                    if (p1.getTipo() == "CC") {
                        float real = valor - 0.10f;
                        p1.depositar(real);
                        JOptionPane.showMessageDialog(null, "=======Bank of Desespero=======\n Olá, " + p1.getDono()
                                + ", O Valor foi depositado em sua conta com Sucesso! \n Num. Conta: "
                                + p1.getNumConta() + "\n Tipo da Conta: " + nomeExtensoTipoConta
                                + "\n Status da Conta: " + statusConta + "\n Saldo atual é de: " + p1.getSaldo());
                    } else if (p1.getTipo() == "CP") {
                        p1.depositar(valor);
                        JOptionPane.showMessageDialog(null, "=======Bank of Desespero=======\n Olá, " + p1.getDono()
                                + ", O Valor foi depositado em sua conta com Sucesso! \n Num. Conta: "
                                + p1.getNumConta() + "\n Tipo da Conta: " + nomeExtensoTipoConta
                                + "\n Status da Conta: " + statusConta + "\n Saldo atual é de: " + p1.getSaldo());
                    }
                }
                break;

            case 2:
                valor = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor a ser Sacado: "));
                confirmar = JOptionPane.showConfirmDialog(null, "Voce realmente deseja Sacar o valor? " + valor);
                if (confirmar == JOptionPane.YES_OPTION) {
                    if (p1.getTipo() == "CC") {
                        p1.sacar(valor);
                        JOptionPane.showMessageDialog(null, "=======Bank of Desespero=======\n Olá, " + p1.getDono()
                                + ", O Valor foi sacado em sua conta com Sucesso! \n Num. Conta: " + p1.getNumConta()
                                + "\n Tipo da Conta: " + nomeExtensoTipoConta + "\n Status da Conta: " + statusConta
                                + "\n Saldo atual é de: " + p1.getSaldo());
                    } else if (p1.getTipo() == "CP") {
                        p1.sacar(valor);
                        JOptionPane.showMessageDialog(null, "=======Bank of Desespero=======\n Olá, " + p1.getDono()
                                + ", O Valor foi sacado em sua conta com Sucesso! \n Num. Conta: " + p1.getNumConta()
                                + "\n Tipo da Conta: " + nomeExtensoTipoConta + "\n Status da Conta: " + statusConta
                                + "\n Saldo atual é de: " + p1.getSaldo());
                    }
                }
                break;

            case 3:

                JOptionPane.showMessageDialog(null,
                        "=======Bank of Desespero=======\n Olá, " + p1.getDono()
                                + ", Informações sobre usa conta! \n Num. Conta: " + p1.getNumConta()
                                + "\n Tipo da Conta: " + nomeExtensoTipoConta + "\n Status da Conta: " + statusConta
                                + "\n Saldo atual é de: " + p1.getSaldo());
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "Operação Finalizada Com sucesso!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção Invalida falor Tentar novamente");
        }

    }
}