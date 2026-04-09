

public class stackArray {

    int top = -1;
    int[] stack;
    int size;

    //constructor
    stackArray(int size) {
        this.size = size;
        stack = new int[size];
    }
    //push 
    void push(int value) {
        if (top == size - 1) {
            System.err.println("stack overflow");
            return;
        }
        top++;
        stack[top] = value;
        
    }
    //pop 
    int pop() {
        if (top == -1) {
            System.err.println("stack underflow");
            return -1;
        }
        return stack[top--];
    }
    // peep 
    int peek() {
        if (top == -1) {
            System.err.println("stack underflow");
            return -1;
        }
        return stack[top];
    }

    // display ;
    void display() {
        if (top == -1) {
            System.err.println("stack is empty");
            return;
        }
        System.err.println("stack values are : ");
        for (int i = top; i >= 0; i--) {
            System.err.print(stack[i] + " ");
        }
    // System.err.println( );
}

    public static void main(String[] args) {

        stackArray s = new stackArray(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        s.peek();
        s.display();
    }
}
