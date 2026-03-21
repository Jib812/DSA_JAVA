
public class backtracking {

    public static void print(String str, String perm, int idx) {
        
        if(str.length() == 0) {
            System.out.println(perm);
            return;
        }
        
        for (int i = 0; i < str.length(); i++) {
            char currentchar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            print(newstr, perm + currentchar, idx + 1);
            
        }
        
    }

    public static void main(String[] args) {
        String str = "ABC";
        print(str, "", 0);
    }

}
