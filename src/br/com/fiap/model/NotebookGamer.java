package br.com.fiap.model;

public class NotebookGamer extends Notebook {
    private boolean possuiRgbAtivado;

    public NotebookGamer(String marca, int armazenamentoTotalGb, Processador processador, boolean possuiRgbAtivado) {
        super(marca, armazenamentoTotalGb, processador);
        this.setPossuiRgbAtivado(possuiRgbAtivado);
    }

    public boolean isPossuiRgbAtivado() { return possuiRgbAtivado; }
    public void setPossuiRgbAtivado(boolean possuiRgbAtivado) { this.possuiRgbAtivado = possuiRgbAtivado; }

    //Sobrescrevendo o comportamento com a anotação
    @Override
    public void calcularAutonomiaBateria() {
        System.out.println("Notebook Gamer: Autonomia de apenas 1,5 horas devido ao alto consumo da placa de vídeo.");
    }
}
