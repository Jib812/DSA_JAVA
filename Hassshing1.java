import java.util.*;

//import java.util.HashSet;
//import java.util.Iterator;
public class Hassshing1 {
    
    public static void main(String[] args) {
        
        HashSet<Integer> set = new HashSet<>();

        
        //add
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);
        
        //size ;
        System.out.println(set.size());
        
        // delete
        set.remove(1);

        //serch for ache na nei

        if (set.contains(1)) {
            System.out.print("yes this is avivable here");
        }
        else {
            System.err.println("1 is not here");
        }

        System.out.println(set);

        //Iterator 
        Iterator it = set.iterator();

        
        while (it.hasNext()) {
            System.out.print(it.next());
        }
    }
}
