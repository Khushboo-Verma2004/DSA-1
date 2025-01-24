class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class optimalSolution {
    public static Node oddEvenList(Node head){
        if((head == null) || (head.next == null)){
            return head;
        }

        Node odd = head;
        Node even = head.next;
        Node evenHead = head.next;

        while((even != null) && (even.next != null)){
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        
        return head;
    }

    // Utility function for printing the list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Utility function for creating the list
    public static Node createList(int[] values) {
        if (values.length == 0) {
            return null;
        }
        Node head = new Node(values[0]);
        Node current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new Node(values[i]);
            current = current.next;
        }
        return head;
    }
    public static void main(String[] args) {

        // Example 1
        int[] values1 = {1, 2, 3, 4, 5};
        Node head1 = createList(values1);
        System.out.println("Original List:");
        printList(head1);

        Node reordered1 = oddEvenList(head1);
        System.out.println("Reordered List:");
        printList(reordered1);

        // Example 2
        int[] values2 = {2, 1, 3, 5, 6, 4, 7};
        Node head2 = createList(values2);
        System.out.println("Original List:");
        printList(head2);

        Node reordered2 = oddEvenList(head2);
        System.out.println("Reordered List:");
        printList(reordered2);
    }
}