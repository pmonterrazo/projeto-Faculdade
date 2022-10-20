package Projeto_Faculdade.BancoBrasil.entites;

public class conta {

    public int numConta; // Receber numero da conta
    private String tipo; // Recebe o tipo de conta CC (Conta Corrente ou CP Conta Poupança)
    private String dono; // Recebe o nome do dono da conta
    private float saldo; // recebe o saldo da conta
    private float taxa = 12; // predefinir uma taxa padrão para trabalhar em cima
    private boolean status; // status da conta Ativa ou Fechada (True ou False)

    // Metodo construtor baseado
    public conta() {
        this.setSaldo(0);
        this.setStatus(false);
        this.setTaxa(12);
    }

    // Metodo para abrir conta
    public void abrirConta(String t) {
        this.setTipo(t.toUpperCase());
        this.setStatus(true);
        if (t.equals("CC")) {
            this.setSaldo(150);
            this.setSaldo(this.getSaldo() - 24);
        } else if (t.equals("CP")) {
            this.setSaldo(250);
            this.setSaldo(this.getSaldo() - 36);
        } else {
            System.out.println("Valor Invalido");
        }
    }

    // Metodo para fechar conta
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("A Conta não pode ser fechada por que ainda tem dinheiro!");
        } else if (this.getSaldo() < 0) {
            System.out.println("A Conta não pode ser fechada por que esta NEGATIVADA!");
        } else {
            this.setStatus(false);
            System.out.println("Conta Encerrada com Sucesso!");
        }
    }

    // Metodo para depositar
    public void depositar(float v) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesso!, na conta de: " + this.getDono());
        } else if (this.isStatus() && this.getTipo() == "CC") {
            float taxaDeposito = 10;
            this.setSaldo(this.getSaldo() + v);
            this.setSaldo(this.getSaldo() - taxaDeposito);
            System.out.println("Deposito realizado com sucesso!, na conta de: " + this.getDono());
        } else {
            System.out.println("Impossivel depositar em uma conta FECHADA");
        }
    }

    // Metodo para sacar
    public void sacar(float v) {
        if (this.isStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado com sucesso!, na conta de: " + this.getDono());
            } else {
                System.out.println("Saldo Insuficiente!");
            }
        } else {
            System.out.println("Impossivel Sacar em uma conta FECHADA");
        }
    }

    // Metodos GETs e SETs
    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}