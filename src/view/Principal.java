package view;

import br.edu.fateczl.fila.Fila;
import controller.EscalonadorController;
import model.Processo;

public class Principal {
    public static void main(String[] args) throws Exception {
        Fila<Processo> filaDeProcessos = new Fila<>();

        // Adicionando processos na fila
        filaDeProcessos.insert(new Processo("notepad.exe", 14));
        filaDeProcessos.insert(new Processo("write.exe", 35));
        filaDeProcessos.insert(new Processo("chrome.exe", 27));
        filaDeProcessos.insert(new Processo("acrobat.exe", 52));
        filaDeProcessos.insert(new Processo("firefox.exe", 18));
        filaDeProcessos.insert(new Processo("word.exe", 25));

        EscalonadorController escalonador = new EscalonadorController();
        escalonador.escalonador(filaDeProcessos);
    }
}
