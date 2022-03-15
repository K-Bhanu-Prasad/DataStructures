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

    public void deleteFirst() {
        if (this.head != null) {
            head = head.next;
        }
    }

    public void deleteAtIndex(final int index) {
        if (index == 0) {
            deleteFirst();
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public void deleteWithValue(final int value) {
        Node temp = head, prev = head;
        while (temp != null && temp.data != value) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("\nNo element found with value " + value);
        } else {
            prev.next = temp.next;
        }
    }

    public void deleteLast() {
        Node prev = head;
        while (prev.next.next != null) {
            prev = prev.next;
        }
        prev.next = null;
    }

    public static void traverseLinkedList(final Node node) {
        Node temp = node;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
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

        System.out.println("\nList is :");
        traverseLinkedList(linkedList.head);

        linkedList.deleteFirst();

        System.out.println("\nAfter deleting first element");
        traverseLinkedList(linkedList.head);

        linkedList.deleteLast();

        System.out.println("\nAfter deleting last element");
        traverseLinkedList(linkedList.head);

        linkedList.deleteWithValue(33);

        System.out.println("\nAfter deleting element 33");
        traverseLinkedList(linkedList.head);

        linkedList.deleteAtIndex(2);

        System.out.println("\nAfter deleting element at index 2");
        traverseLinkedList(linkedList.head);
    }

}
