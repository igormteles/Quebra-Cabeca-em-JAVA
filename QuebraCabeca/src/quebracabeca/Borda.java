/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quebracabeca;

/**
 *
 * @author aluno
 */


public class Borda {
    private int[] brd = new int [2]; 

    public Borda(int[] brd) {
        this.brd = brd;
    }

    public int[] getBrd() {
        return brd;
    }

    public boolean podeEncaixar(Borda s) {
        return this.brd == s.getBrd();
    }

    @Override
    public String toString() {
        return brd.toString();
    }
}
