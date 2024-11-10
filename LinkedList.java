// add 1st & add last

public class LinkedList {
    public static Node head;
    public static Node tail;

    // Node class representing each element in the linked list
    public static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add a node at the beginning of the linked list
    public void addFirst(int data) {
        // Step 1: Create a new node
        Node newNode = new Node(data);

        // Step 2: If the list is empty, set both head and tail to the new node
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 3: Link the new node to the current head
        newNode.next = head;

        // Step 4: Update the head to the new node
        head = newNode;
    }

    // Add a node at the end of the linked list
    public void addLast(int data) {
        // Step 1: Create a new node
        Node newNode = new Node(data);

        // Step 2: If the list is empty, set both head and tail to the new node
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 3: Link the current tail to the new node
        tail.next = newNode;

        // Step 4: Update the tail to the new node
        tail = newNode;
    }

    // Helper method to display the linked list
    public void printList() {
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);

        // ll.printList();
        // ll.addFirst(1);
        // ll.printList();
        // ll.addFirst(2);
        // ll.printList();
        // ll.addLast(3);
        // ll.printList();
        // ll.addLast(4);
        // ll.printList();

        // Output the linked list
        ll.printList(); // Output: 20 -> 10 -> 30 -> 40 -> null
    }
}
