/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quebracabeca;

/**
 *
 * @author aluno
 */

public class Peca {
    private Borda cim;
    private Borda dir;
    private Borda bax;
    private Borda esq;

    public Peca(Borda cim, Borda dir, Borda bax, Borda esq) {
        this.cim = cim;
        this.dir = dir;
        this.bax = bax;
        this.esq= esq;
    }

    public Borda getCim() {
        return cim;
    }

    public Borda getDir() {
        return dir;
    }

    public Borda getBax() {
        return bax;
    }

    public Borda getEsq() {
        return esq;
    }

    public boolean podeEncaixar(Peca outra) {
        return this.dir.getBrd() == outra.getEsq().getBrd() &&
               this.bax.getBrd() == outra.getCim().getBrd();
    }

    @Override
    public String toString() {
        return String.format("Topo: %s, Direita: %s, Baixo: %s, Esquerda: %s", cim, dir, bax, esq);
    }
}
