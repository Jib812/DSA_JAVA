
import java.util.*;

public class hasshmap {
    public static void main(String[] args) {
        
    HashMap<String,Integer> map = new HashMap<>();

    map.put("india", 120);
    map.put("aus",69);

    System.out.println(map);

    map.put("india", 180);
    System.out.println(map);

    //serch 
    if (map.containsKey("india")) {     // it returns yes or no
        System.out.println("the value is in it");
    }
    else {
        System.out.println("the valye is not in it");
    }

    for (Map.Entry<String, Integer> e : map.entrySet()) {
        System.out.println(e.getKey());
        System.out.println(e.getValue());
    }
    map.remove("india");

    }    
}
