public class MyLinkedList {
    static class Node {
        int data;
        Node next;
    }

    public static void main(String[] args) {
        // Create nodes
        Node head = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();

        head.data = 2;
        head.next = n2;

        n2.data = 45;
        n2.next = n3;

        n3.data = 67;
        n3.next = n4;

        n4.data = 19;

        traverseLinkedList(head);
    }

    public static void traverseLinkedList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

}
