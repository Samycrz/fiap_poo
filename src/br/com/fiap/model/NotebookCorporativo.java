package br.com.fiap.model;

public class NotebookCorporativo extends Notebook {
    private boolean possuiLeitorBiometrico;

    public NotebookCorporativo(String marca, int armazenamentoTotalGb, Processador processador, boolean possuiLeitorBiometrico) {
        super(marca, armazenamentoTotalGb, processador);
        this.setPossuiLeitorBiometrico(possuiLeitorBiometrico);
    }

    public boolean isPossuiLeitorBiometrico() { return possuiLeitorBiometrico; }
    public void setPossuiLeitorBiometrico(boolean possuiLeitorBiometrico) { this.possuiLeitorBiometrico = possuiLeitorBiometrico; }

    // Comportamento diferente
    @Override
    public void calcularAutonomiaBateria() {
        System.out.println("Notebook Corporativo: Autonomia prolongada de 8 horas ativando o modo de economia.");
    }
}