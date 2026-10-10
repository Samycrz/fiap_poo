package br.com.fiap.main;

import br.com.fiap.model.Notebook;
import br.com.fiap.model.NotebookGamer;
import br.com.fiap.model.NotebookCorporativo;
import br.com.fiap.model.Processador;
import java.util.ArrayList;
import java.util.List;

public class SistemaPrincipal2 {

    public static void main(String[] args) {
        //Instanciando os objetos associados
        Processador procGamer = new Processador("Intel Core i9", 3.5);
        Processador procCorp = new Processador("Intel Core i5", 2.4);

        // Instanciando as filhas (Herança)
        NotebookGamer gamer = new NotebookGamer("Alienware", 1000, procGamer, true);
        NotebookCorporativo corporativo = new NotebookCorporativo("Dell Latitude", 512, procCorp, true);

        System.out.println("--- Missão 4: Teste da Associação ---");
        System.out.println("O Notebook " + gamer.getMarca() + " tem o processador: " + gamer.getProcessador().getModelo());

        System.out.println("\n--- Missão 6: Teste de Fogo do Polimorfismo ---");
        // Criando a Lista tipada com a Superclasse e adicionando as Filhas
        List<Notebook> frota = new ArrayList<>();
        frota.add(gamer);
        frota.add(corporativo);

        // Prova do polimorfismo
        for (Notebook note : frota) {
            System.out.println("\nAvaliando autonomia do notebook da " + note.getMarca() + "...");
            // O Java descobre dinamicamente qual versão do método executar
            note.calcularAutonomiaBateria();
        }
    }
}