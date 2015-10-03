/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.HashMap;

/**
 *
 * @author usuario
 */
public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Integer [] vector = {1,1,1,3,4,5,6,9,100,4,3,3,3};
       String [] vector1 = {"Ana", "Juan", "Pedro", "José"};
       
       Histogram histo = CalculaHistogram.computeHisto(vector);

        for (Object key : histo.keySet()) {
                System.out.println(key + " : " + histo.get(key));        
        }
    }
}

