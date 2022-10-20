package Projeto_Faculdade.BancoBrasil.entites;

public class contaCorrente extends conta {


    public void abrirContaCorrente() {
        float v = this.getTaxa();
        float dobro = v * 2;
        this.setSaldo(this.getSaldo() + dobro);
        System.out.println("Conta aberta com Sucesso!");
        System.out.println("Como sua conta é do Tipo Conta Corrente, o banco cobra uma taxa sendo a sua de: R$ 24,00");
    }

    public void depositoContaCorrente(float v) {
        float taxaDeposito = 0.10F;
        this.setSaldo(this.getSaldo() + v);
        this.setSaldo(getSaldo() - taxaDeposito);
        System.out.println("Deposito realizado com sucesso!, na conta de: " + this.getDono());
    }
}
