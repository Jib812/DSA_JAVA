import java.util.ArrayList ;
import java.util.Collections;
public class ArrayLists {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        //add elements
        list.add(1);
        list.add(0);
        list.add(99);
        System.out.println(list);

        //remove elements 
        list.remove(0);
        System.out.println(list);
         
        //add elemets ; 

        list.add(1,3);
        System.err.println(list);
         
        // get elements 
        System.err.println(list.get(2));
       
        //set elemets ; 
        list.set(0,23);
        System.err.println(list);

        //size 
        int size = list.size();
        System.err.println(size);
    
        //sorting an array 

        Collections.sort(list);
         System.out.println(list);
    
    }

}
