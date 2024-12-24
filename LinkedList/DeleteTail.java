package LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteTail {
    Node head;

    public void insertHead(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    public void printLinkedList() {
        if (head == null) {
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public void deleteTail() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void main(String[] arg) {
        DeleteTail list = new DeleteTail();

        list.insertHead(1);
        list.insertHead(2);
        list.insertHead(3);
        list.insertHead(4);

        list.printLinkedList();

        list.deleteTail();

        list.printLinkedList();
    }

}
