package br.com.fiap.main;

import br.com.fiap.model.Notebook;

public class SistemaPrincipal2 {

    public static void main(String[] args) {

        Notebook meuNotebook = new Notebook("Asus", 256);

        System.out.println("--- Teste 1: Tentando conectar desligado ---");
        meuNotebook.conectarWifi("Rede_Casa");

        System.out.println("\n--- Ligando a Máquina ---");
        meuNotebook.ligar();

        System.out.println("\n--- Teste 3: Conectando à Rede ---");
        meuNotebook.conectarWifi("Rede_Casa");

        System.out.println("\n--- Resolvendo a Bateria e Atualizando ---");
        meuNotebook.carregarBateria(80.0);

        // --- CUMPRINDO O PASSO 6 DA MISSÃO (Mídia.jpg) ---
        System.out.println("\n--- Teste da Regra Especial no Set (Passo 6) ---");
        System.out.println("Armazenamento antes de tentar burlar: " + meuNotebook.getEspacoLivreGb() + "GB");

        // Tentando forçar o estado para algo inconsistente (negativo)
        meuNotebook.setEspacoLivreGb(-50);

        // Comprovando que a classe ignorou o ataque e manteve o estado real
        System.out.println("Armazenamento atual no objeto pós-tentativa: " + meuNotebook.getEspacoLivreGb() + "GB");
    }
}