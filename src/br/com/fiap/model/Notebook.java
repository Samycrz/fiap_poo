package br.com.fiap.model;

public class Notebook {

    private String marca;
    private boolean ligado;
    private double nivelBateria;
    private int espacoLivreGb;
    private boolean conectadoWifi;

    public Notebook(String marca, int armazenamentoTotalGb) {
        this.marca = marca;
        this.espacoLivreGb = armazenamentoTotalGb;
        this.ligado = false;
        this.nivelBateria = 15.0;
        this.conectadoWifi = false;
    }

    // --- MÉTODOS DE COMPORTAMENTO ---
    public void ligar() {
        if (this.ligado) {
            System.out.println("Aviso: O notebook já está ligado.");
            return;
        }
        if (this.nivelBateria <= 0) {
            System.out.println("Erro: Bateria esgotada. Conecte o notebook na tomada para ligar.");
            return;
        }
        this.ligado = true;
        System.out.println("Notebook da " + this.marca + " iniciando sistema...");
    }

    public void carregarBateria(double carga) {
        if (carga <= 0) {
            System.out.println("Erro: Valor de carga inválido.");
            return;
        }
        this.nivelBateria += carga;
        if (this.nivelBateria > 100.0) {
            this.nivelBateria = 100.0;
        }
        System.out.println("Bateria carregada. Nível atual: " + this.nivelBateria + "%");
    }

    public void conectarWifi(String nomeRede) {
        if (!this.ligado) {
            System.out.println("Erro: Impossível conectar ao Wi-Fi. O notebook está desligado.");
            return;
        }
        if (nomeRede == null || nomeRede.trim().isEmpty()) {
            System.out.println("Erro: Nome da rede inválido.");
            return;
        }
        if (this.conectadoWifi) {
            System.out.println("Aviso: O notebook já está conectado a uma rede Wi-Fi.");
            return;
        }
        this.conectadoWifi = true;
        System.out.println("Conexão estabelecida com sucesso na rede: " + nomeRede);
    }

    // --- GETTERS (Passo 4 de Mídia.jpg) ---
    public String getMarca() { return this.marca; }
    public boolean isLigado() { return this.ligado; }
    public double getNivelBateria() { return this.nivelBateria; }
    public int getEspacoLivreGb() { return this.espacoLivreGb; }
    public boolean isConectadoWifi() { return this.conectadoWifi; } // Adicionado

    // --- SETTERS (Passo 4 e 5 de Mídia.jpg) ---
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void setNivelBateria(double nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public void setConectadoWifi(boolean conectadoWifi) {
        this.conectadoWifi = conectadoWifi;
    }

    // Regra Especial do Set (Passo 5 da missão)
    public void setEspacoLivreGb(int espacoLivreGb) {
        if (espacoLivreGb < 0) {
            System.out.println("Erro de Validação: O armazenamento não pode aceitar valores negativos!");
            return; // Bloqueia a alteração indevida
        }
        this.espacoLivreGb = espacoLivreGb;
        System.out.println("Espaço livre atualizado internamente para: " + this.espacoLivreGb + "GB");
    }
}