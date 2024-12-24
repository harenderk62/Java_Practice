package LinkedList;

// class Node {
//     int data;
//     Node next;

//     public Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

public class InsertionAtKth {
    Node head;

    public void insertAtkth(int data, int k) {
        if (k < 0) {
            System.out.println("Position is invalid");
            return;
        }

        Node newNode = new Node(data);
        // int count = k;

        if (k == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        int currentPos = 0;
        while (temp != null && currentPos < k - 1) {
            temp = temp.next;
            currentPos++;
        }

        if (temp == null) {
            System.out.println("Out of range");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void printLinkedList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InsertionAtKth list = new InsertionAtKth();

        list.insertAtkth(1, 0);
        list.insertAtkth(3, 1);
        list.insertAtkth(2, 2);
        list.insertAtkth(6, 1);
        list.insertAtkth(5, 2);

        list.printLinkedList();

        list.insertAtkth(10, 2);

        list.printLinkedList();
    }
}
