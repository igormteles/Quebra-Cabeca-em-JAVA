/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quebracabeca;

/**
 *
 * @author Igor Mateus Teles
 */

public class QuebraCabeca {
    public static void main(String[] args) {
        int[] t = {1,0};
        int[] r = {0,1};
        int[] p = {1,1};
        
        Borda cim1 = new Borda(t);
        Borda dir1 = new Borda(r);
        Borda bax1 = new Borda(t);
        Borda esq1 = new Borda(r);

        Borda cim2 = new Borda(t);
        Borda dir2 = new Borda(t);
        Borda bax2 = new Borda(p);
        Borda esq2 = new Borda(r);

        Borda cim3 = new Borda(p);
        Borda dir3 = new Borda(t);
        Borda bax3 = new Borda(r);
        Borda esq3 = new Borda(t);

        Borda cim4 = new Borda(t);
        Borda dir4 = new Borda(t);
        Borda bax4 = new Borda(r);
        Borda esq4 = new Borda(r);

        Borda cim5 = new Borda(p);
        Borda dir5 = new Borda(r);
        Borda bax5 = new Borda(t);
        Borda esq5 = new Borda(p);

        Borda cim6 = new Borda(t);
        Borda dir6 = new Borda(t);
        Borda bax6 = new Borda(t);
        Borda esq6 = new Borda(r);

        Borda cim7 = new Borda(t);
        Borda dir7 = new Borda(p);
        Borda bax7 = new Borda(r);
        Borda esq7 = new Borda(r);

        Borda cim8 = new Borda(r);
        Borda dir8 = new Borda(t);
        Borda bax8 = new Borda(r);
        Borda esq8 = new Borda(t);

        Borda cim9 = new Borda(p);
        Borda dir9 = new Borda(p);
        Borda bax9 = new Borda(r);
        Borda esq9 = new Borda(t);

        Peca peca1 = new Peca(cim1, dir1, bax1, esq1);
        Peca peca2 = new Peca(cim2, dir2, bax2, esq2);
        Peca peca3 = new Peca(cim3, dir3, bax3, esq3);
        Peca peca4 = new Peca(cim4, dir4, bax4, esq4);
        Peca peca5 = new Peca(cim5, dir5, bax5, esq5);
        Peca peca6 = new Peca(cim6, dir6, bax6, esq6);
        Peca peca7 = new Peca(cim7, dir7, bax7, esq7);
        Peca peca8 = new Peca(cim8, dir8, bax8, esq8);
        Peca peca9 = new Peca(cim9, dir9, bax9, esq9);

        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.adicionarPeca(peca1);
        tabuleiro.adicionarPeca(peca2);
        tabuleiro.adicionarPeca(peca3);
        tabuleiro.adicionarPeca(peca4);
        tabuleiro.adicionarPeca(peca5);
        tabuleiro.adicionarPeca(peca6);
        tabuleiro.adicionarPeca(peca7);
        tabuleiro.adicionarPeca(peca8);
        tabuleiro.adicionarPeca(peca9);

        tabuleiro.verificarEncaixes();
    }
}
