package LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertionAtBeginning {
    Node head;

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
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
        InsertionAtBeginning list = new InsertionAtBeginning();

        list.insertAtBeginning(3);
        list.insertAtBeginning(1);
        list.insertAtBeginning(2);
        list.insertAtBeginning(5);
        list.insertAtBeginning(8);

        list.printLinkedList();

        list.insertAtBeginning(10);

        list.printLinkedList();
    }
}
