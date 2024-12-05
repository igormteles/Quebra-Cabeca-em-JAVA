/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quebracabeca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */

public class Tabuleiro {
    private List<Peca> pecas;

    public Tabuleiro() {
        pecas = new ArrayList<>();
    }

    public void adicionarPeca(Peca peca) {
        pecas.add(peca);
    }

    public void verificarEncaixes() {
        for (int i = 1; i < pecas.size(); i++) {
            for (int j = i + 1; j < pecas.size(); j++) {
                if (pecas.get(i).podeEncaixar(pecas.get(j))) {
                    System.out.println("As pecas " + i + " e " + j + " podem se encaixar.");
                }
                else{
                    System.out.println("As pecas " + i + " e " + j + " nao podem se encaixar.");
                }
            }
        }
    }
}
