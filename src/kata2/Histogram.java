
package kata2;

import java.util.HashMap;
import java.util.Set;


/**
 *
 * @author usuario
 */
public class Histogram <T>{

    
    
    private final HashMap<T, Integer> map = new HashMap<>();
    
    public Integer get(Object key) {
        return map.get(key);
    }

    public Set<T> keySet() {
        return map.keySet();
    }
    
    public Integer increment (T key) {
        return map.put(key,map.containsKey(key) ? map.put(key, map.get(key)) +1 : 1);
    }
}

