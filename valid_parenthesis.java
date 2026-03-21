
class valid_parenthesis {
    
    char []stack ;
    int top = -1;
    int size ;
    
    
    valid_parenthesis(int size){
        this.size = size ;
        stack = new char[size];
    }
    
    void push(char data){
        if(top==size-1){
            System.out.println("stack is full");
        }
        else {
            top++;
            stack[top]= data ;
        }
    }
    
    char pop(){
        if(top == -1){
            System.out.println("stack is empty");
        return '#';
        }
        else {
            return stack[top--];
            
        }
    }
    
    
char peek(){
        if(top == -1){
            System.out.println("stack is empty");
        return '#';
        }
        else {
            return stack[top];
            
        }
    }
    
    
    void display(){
        if(top == -1){
            System.out.println("stack is empty");
        // return ;
    }
    else {
        for(int i =top ; i >=0;i--){
            System.out.print(stack[i]+ " ");
        }
    }
    }
    
    static boolean isValid(String input){
        valid_parenthesis st = new valid_parenthesis(input.length());
        for(int i = 0; i<input.length();i++){
            char ch = input.charAt(i);
        
            if(ch =='(' || ch =='{' || ch == '['){
                st.push(ch);
            }
            else {
                if(st.peek() == '(' && ch == ')'
                || st.peek() == '{' && ch == '}'
                || st.peek() == '[' && ch == ']'
                ){
                    
                st.pop();
                }
                else {
                    return false ;
                }
            }
            
        }
        return st.top ==-1;
    }
    
    public static void main(String[] args) {
 System.out.println(isValid("()"));      // true
        System.out.println(isValid("([)]"));    // false
        System.out.println(isValid("{[]}"));    // true
        System.out.println(isValid("((("));  

    }
}