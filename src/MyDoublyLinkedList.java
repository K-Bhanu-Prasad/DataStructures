public class MyDoublyLinkedList {

    Node head;

    static class Node {
        private Node prev;
        private int data;
        private Node next;

        Node(final Node prev, final int data, final Node next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
    }

    private void traverse() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    private void insertAtBeginning(final int data) {
        final Node node = new Node(null, data, this.head);
        if (this.head != null) {
            this.head.prev = node;
        }
        this.head = node;
    }

    private void insertAfterElement(final int element, final int data) {
        final Node node = new Node(null, data, null);
        Node temp = this.head;
        while (temp != null && temp.data != element) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("\n No element found with " + element);
            return;
        }
        node.prev = temp;
        node.next = temp.next;
        temp.next = node;
    }

    public static void main(String[] args) {
        MyDoublyLinkedList list = new MyDoublyLinkedList();
        list.insertAtBeginning(5);
        list.insertAtBeginning(56);
        list.insertAtBeginning(33);
        list.insertAtBeginning(17);

        list.traverse();

        list.insertAfterElement(33, 102);
        list.traverse();

        list.insertAfterElement(99, 378);
        list.traverse();
    }

}
