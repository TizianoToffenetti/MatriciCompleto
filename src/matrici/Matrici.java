/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrici;

/**
 *
 * @author Tiziano Toffenetti
 */
public class Matrici {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matrice m = new Matrice(10, 10);
        
        /*
        m.fillRandom();
        System.out.println(m);
        m.toFile("data/matrice.txt");
        */
        
        m.fromFile("data/matrice.txt");
        System.out.println(m);
    }
}
