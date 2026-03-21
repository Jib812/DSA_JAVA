public class reverse_linklisted {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    int size = 0;   // 👈 size of linked list

    // 1. Add element at first
    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            size++;   // 👈 increase size
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;     // 👈 increase size
    }

    // 2. Add element at last
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            size++;   // 👈 increase size
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        size++;       // 👈 increase size
    }

    // 3. Delete element from first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        size--;       // 👈 decrease size
    }

    // 4. Print the linked list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
// 6. Delete element from last
public void deleteLast() {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    // If only one node
    if (head.next == null) {
        head = null;
        size--;   // 👈 decrease size
        return;
    }

    Node curr = head;
    while (curr.next.next != null) {
        curr = curr.next;
    }

    curr.next = null;
    size--;       // 👈 decrease size
}



    // 5. Get size of linked list
    public int getSize() {
        return size;
    }
public Node reverse_linklist(Node head){ // this is recurtion methos..also has ( iterative method)
    if(head == null || head.next == null){
        return head;
    }
    Node newhead = reverse_linklist(head.next);
    head.next.next=head;
    head.next=null ;
    return newhead ;
}

    // Main method
    public static void main(String[] args) {

        reverse_linklisted list = new reverse_linklisted();

        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.addLast(40);

        list.printList();
        System.out.println("Size: " + list.getSize());

        list.deleteFirst();
        list.printList();
        System.out.println("Size: " + list.getSize());

        // list.deleteLast();
//list.printList();
//System.out.println("Size: " + list.getSize());

   list.head=list.reverse_linklist(list.head);
   list.printList();
    }
}
