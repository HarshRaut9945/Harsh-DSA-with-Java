public class Delete_Middle {
     
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;

        void insert(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // ✅ Delete middle node (NO prev used)
        void deleteMiddle() {
            if (head == null || head.next == null) {
                head = null;
                return;
            }

            Node slow = head;
            Node fast = head;

            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // Delete the node after slow (i.e., the actual middle)
            if (slow.next != null) {
                slow.data = slow.next.data;
                slow.next = slow.next.next;
            }
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.insert(20);
        li.insert(30);
        li.insert(40);
        li.insert(25);
        li.insert(65);
        li.insert(15);

        System.out.println("Before deleting middle:");
        li.display();

        li.deleteMiddle();  // Correct usage without prev

        System.out.println("After deleting middle:");
        li.display();
    }
}
