package br.com.fiap.model;

public class Processador {
    private String modelo;
    private double frequenciaGhz;

    public Processador(String modelo, double frequenciaGhz) {
        this.setModelo(modelo);
        this.setFrequenciaGhz(frequenciaGhz);
    }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public double getFrequenciaGhz() { return frequenciaGhz; }
    public void setFrequenciaGhz(double frequenciaGhz) { this.frequenciaGhz = frequenciaGhz; }
}