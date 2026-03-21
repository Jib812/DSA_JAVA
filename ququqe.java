public class ququqe {

    static class queue {
        int[] arr;
        int front;
        int rear;
        int size;

        // constructor
        queue(int size) {
            this.size = size;
            arr = new int[size];
            front = 0;
            rear = -1;
        }

        void enqueue(int data) {
            if (rear == size - 1) {
                System.out.println("queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        int dequeue() {
            if (front > rear) {
                System.out.println("queue is empty");
                return -1;
            }
            return arr[front++];
        }

        int peek() {
            if (front > rear) {
                System.out.println("queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        queue q = new queue(5);

        q.enqueue(1);
        q.enqueue(2);

        System.out.println(q.dequeue()); // 1
        System.out.println(q.peek());    // 2
    }
}
