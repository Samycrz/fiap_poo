package br.com.fiap.model;

public class Passageiro {
    private String nome;
    private String cpf;
    private double saldo;
    private boolean contaAtiva;

    // Construtor
    public Passageiro(String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSaldo(0.0);
        this.setContaAtiva(true);
    }


    public void adicionarSaldo(double valor) {
        if (!this.contaAtiva) {
            System.out.println("Erro: Conta encerrada. Não é possível recarregar.");
            return;
        }
        if (valor <= 0) {
            System.out.println("Erro: O valor da recarga deve ser maior que zero!");
            return;
        }
        this.saldo += valor;
        System.out.println("Recarga de R$ " + valor + " realizada com sucesso para " + this.nome);
    }


    public void pagarViagem(double valor) {
        if (!this.contaAtiva) {
            System.out.println("Erro: Conta encerrada. Não é possível viajar.");
            return;
        }
        if (valor <= 0) {
            System.out.println("Erro: Valor de viagem inválido.");
            return;
        }
        if (this.saldo < valor) {
            System.out.println("Erro de Validação: Saldo insuficiente. Saldo atual: R$ " + this.saldo);
            return;
        }
        this.saldo -= valor;
        System.out.println("Pagamento aprovado. Novo saldo de " + this.nome + ": R$ " + this.saldo);
    }

    public void transferirSaldo(Passageiro destino, double valor) {
        if (!this.contaAtiva) {
            System.out.println("Erro: Sua conta está encerrada. Não é possível transferir.");
            return;
        }

        if (valor <= 0) {
            System.out.println("Erro: Valor de transferência inválido.");
            return;
        }

        if (this.saldo < valor) {
            System.out.println("Erro: Saldo insuficiente para transferir R$ " + valor);
            return;
        }

        if (destino == null) {
            System.out.println("Erro: Passageiro de destino inválido.");
            return;
        }

        this.saldo -= valor;
        destino.adicionarSaldo(valor);
        System.out.println("Sucesso: " + this.nome + " transferiu R$ " + valor + " para " + destino.getNome());
    }

    public void encerrarConta() {
        if (!this.contaAtiva) {
            System.out.println("Aviso: A conta de " + this.nome + " já está encerrada.");
            return;
        }

        if (this.saldo > 0) {
            System.out.println("Erro: Não é possível encerrar a conta. Você ainda possui R$ " + this.saldo + ". Transfira ou utilize o saldo antes.");
            return;
        }

        this.contaAtiva = false;
        System.out.println("Conta de " + this.nome + " encerrada com sucesso.");
    }

    public String getNome() { return this.nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return this.cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public double getSaldo() { return this.saldo; }
    private void setSaldo(double saldo) { this.saldo = saldo; }

    public boolean isContaAtiva() { return this.contaAtiva; }
    public void setContaAtiva(boolean contaAtiva) { this.contaAtiva = contaAtiva; }
}
