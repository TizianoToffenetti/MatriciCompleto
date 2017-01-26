/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matrici;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tiziano Toffenetti
 */
public class Matrice {
        int [][] theMatrix;

    public Matrice(int x, int y) {
        theMatrix = new int [x][y];
    }
    public Matrice (int [][] m) {
        theMatrix = m;
    }
    public void fillRandom() {
      for (int i = 0; i < theMatrix.length; i++) {
        for (int j = 0; j < theMatrix[i].length; j++) {
          theMatrix[i][j] = (int) (Math.random()*10);
        }
      }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < theMatrix.length; i++) {
            for (int j = 0; j < theMatrix[i].length; j++) {
                s += theMatrix[i][j];
                if (j<theMatrix[i].length-1) {
                    s += ";";
                }
            }
            s += "\n";
        }
        return s;
    }

    public void toFile( String filename ) {
            try {
                FileWriter fw = new FileWriter (filename);
                fw.write(this.toString());
                fw.close();
            } catch (IOException exc) {
                Logger.getLogger(Matrice.class.getName()).log(Level.SEVERE, null, exc);
            }
    }   
    public void fromFile (String filename){
        
    }   
}
