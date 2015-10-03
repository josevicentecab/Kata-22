/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

/**
 *
 * @author usuario
 */
public class CalculaHistogram {
    public static <T> Histogram<T> computeHisto (T[] vector) {
        Histogram histo = new Histogram<>();
        
        for (T t: vector) {
            histo.increment(t);
            
        }
        return histo;
    }
}
