public class MyLinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }


    public void push(int data) {
        Node node = new Node(data);
        if (head != null) {
            node.next = this.head;
        }
        this.head = node;
    }

    public void insertAfter(final Node preNode, final int data) {
        final Node newNode = new Node(data);
        newNode.next = preNode.next;
        preNode.next = newNode;
    }

    public void insertAtEnd(final int data) {
        final Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }


    public static void traverseLinkedList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {

        MyLinkedList linkedList = new MyLinkedList();
        linkedList.push(10);
        linkedList.push(20);
        linkedList.push(30);
        linkedList.push(40);

        linkedList.insertAfter(linkedList.head.next.next, 33);

        linkedList.insertAtEnd(99);

        traverseLinkedList(linkedList.head);
    }

}
