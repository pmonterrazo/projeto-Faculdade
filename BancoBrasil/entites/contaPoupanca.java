package Projeto_Faculdade.BancoBrasil.entites;

public class contaPoupanca extends conta {

    public void abrirContaPopanca() {
        float v = this.getTaxa();
        float dobro = v * 3;
        this.setSaldo(this.getSaldo() + dobro);
        System.out.println("Conta aberta com Sucesso!");
        System.out.println("Como sua conta é do Tipo Conta Poupança, o banco cobra uma taxa sendo a sua de: R$ 36,00");
    }

    public void atualizarTaxaContaPopanca() {
        float v = this.getTaxa();
        float dobro = v * 3;
        this.setSaldo(this.getSaldo() + dobro);
    }
}