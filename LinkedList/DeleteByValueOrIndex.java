package LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteByValueOrIndex {
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

    public void deleteByValue(int value) {
        if (head == null) {
            return;
        }

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next.data != value && temp.next != null) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Value not found");
            return;
        }

        temp.next = temp.next.next;

    }

    public void deleteByIndex(int position) {

        if (head == null) {
            return;
        }

        if (position == 0 && head.next == null) {
            head = null;
            return;
        }

        int current = 0;
        Node temp = head;

        while (temp != null && current < position - 1) {
            temp = temp.next;
            current++;
        }

        if (temp.next == null || temp == null) {
            System.out.println("out of bounds");
            return;
        }

        temp.next = temp.next.next;
    }

    public static void main(String[] arg) {
        {
            DeleteByValueOrIndex list = new DeleteByValueOrIndex();

            list.insertHead(1);
            list.insertHead(2);
            list.insertHead(3);
            list.insertHead(4);

            list.printLinkedList();

            list.deleteByValue(3);

            list.printLinkedList();

            list.insertHead(6);

            list.printLinkedList();

            list.deleteByIndex(3);

            list.printLinkedList();
        }
    }
}
