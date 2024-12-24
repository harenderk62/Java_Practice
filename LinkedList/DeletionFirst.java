package LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeletionFirst {
    Node head;

    public void insertHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printLinkedList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void deleteHead() {
        if (head == null) {
            return;
        }

        head = head.next;
    }

    public void main(String[] str) {
        DeletionFirst list = new DeletionFirst();

        list.insertHead(1);
        list.insertHead(2);
        list.insertHead(3);
        list.insertHead(4);
        list.insertHead(5);

        list.printLinkedList();

        list.deleteHead();

        list.printLinkedList();
    }
}
