package LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertionAtEnd {
    Node head;

    public void insertAtEnd(int data) {
        Node last = new Node(data);
        if (head == null) {
            head = last;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = last;
    }

    public void printLinkedList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InsertionAtEnd list = new InsertionAtEnd();

        list.insertAtEnd(5);
        list.insertAtEnd(2);
        list.insertAtEnd(6);
        list.insertAtEnd(1);
        list.insertAtEnd(4);

        list.printLinkedList();

        list.insertAtEnd(10);

        list.printLinkedList();
    }

}
