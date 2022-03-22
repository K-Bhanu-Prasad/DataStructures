public class MyCircularLinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(final int data, final Node next) {
            this.data = data;
            this.next = next;
        }
    }

    /***
     * Push method adds element at top behaves like a stack
     * @param data data
     */
    public void push(final int data) {
        final Node node = new Node(data, head);
        if (this.head == null) {
            head = node;
            head.next = head;
        }
        Node temp = head.next;
        if (temp.next != head) {
            temp = temp.next;
        }
        temp.next = node;
        head = node;
    }

    public void insetAtEnd(final int data) {
        final Node node = new Node(data, head);
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public void insertAfterElement(final int element, final int data) {
        final Node node = new Node(data, null);
        Node temp = this.head;
        while (temp.data != element) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
    }

    /***
     * Traverse method print from the head, similar to a stack
     * @param head head
     */
    public static void traverse(final Node head) {
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        MyCircularLinkedList list = new MyCircularLinkedList();
        list.push(3);
        list.push(2);
        list.push(4);

        System.out.println("\n List is");
        traverse(list.head);

        list.insetAtEnd(1);
        System.out.println("\n After inserting 1 at end:");
        traverse(list.head);

        list.insertAfterElement(2, 99);
        System.out.println("\n Inserting 99 after element 2");
        traverse(list.head);

    }

}
