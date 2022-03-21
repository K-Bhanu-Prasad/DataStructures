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

    /***
     * Traverse method print from the head, similar to a stack
     * @param head head
     */
    public static void traverse(final Node head) {
        Node temp = head;
        do {
            System.out.println(temp.data);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        MyCircularLinkedList list = new MyCircularLinkedList();
        list.push(3);
        list.push(2);
        list.push(4);

        traverse(list.head);

    }

}
