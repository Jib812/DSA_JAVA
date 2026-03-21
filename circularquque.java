public class circularquque {
    static class ququqe {
        int front = 0;
        int rare = -1;
        int count = 0;
        int[] arr;
        int size;

        // constructor ;
        ququqe(int size) {
            this.size = size;
            arr = new int[size];
        }

        void enqueue(int data) {
            if (count == size) {
                System.err.println("queue is full");
                return;
            }
            rare = (rare + 1) % size;
            arr[rare] = data;
            count++;
        }

        int dequeue() {
            if (count == 0) {
                System.err.println("queue is empty ");
                return -1;
            }
            count--;
            int d = arr[front];
            front = (front + 1) % size;
            return d;
        }
        
        int peek() {
            if (count == 0) {
                System.err.println("queue is empty ");
                return -1;
            }
            return arr[front];
        }

        void  display() {
            if (count == 0) {
                System.err.println("queue is empty ");
                return ;
            }
            
            for (int i = 0; i < count; i++) {
                System.err.println(arr[front] + " ");
                front = (front + 1) % size;
            }
            System.err.println(" ");
        }
    }

    public static void main(String[] args) {
        ququqe q = new ququqe(5);
        q.dequeue();
        q.enqueue(1);   
        q.enqueue(2);
        
        q.display();
    }
}
