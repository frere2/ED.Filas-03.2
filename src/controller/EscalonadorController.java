package controller;
import br.edu.fateczl.fila.Fila;
import model.Processo;

public class EscalonadorController {
    public void escalonador(Fila<Processo> fila) throws Exception {
        while (!fila.isEmpty()) {
            Processo processo = fila.remove();
            System.out.println("Processando: " + processo);

            processo.decrementaQtdRetornos();

            if (processo.getQtdRetornos() > 0) {
                fila.insert(processo);
            } else {
                System.out.println("Processo " + processo.getNome() + " finalizado.");
            }
        }
    }
}
