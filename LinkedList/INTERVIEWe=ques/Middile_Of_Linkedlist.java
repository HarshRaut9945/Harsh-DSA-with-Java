public class Middile_Of_Linkedlist {
     static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    
    public static ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null; // Only one node, return null
        }

        ListNode slow = head;
        ListNode fast = head;

        // When fast reaches end, slow is before the middle
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Delete the middle node by skipping it
        if (slow.next != null) {
            slow.next = slow.next.next;
        }

        return head;
    }

    public static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
     

        System.out.println("Before deleting middle:");
        display(head);

        head = deleteMiddle(head);

        System.out.println("After deleting middle:");
        display(head);
    }
}
