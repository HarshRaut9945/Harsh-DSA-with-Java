//2130. Maximum Twin Sum of a Linked List
public class Max_Twins_Sum {
    
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    // Reverse a linked list
    public static ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode agla;

        while (curr != null) {
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }
        return prev;
    }

    // Main logic to find maximum twin sum
    public static int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Find the middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        ListNode second = reverse(slow);
        ListNode first = head;

        // Step 3: Compare twin sums
        int maxSum = 0;
        while (second != null) {
            int twinSum = first.val + second.val;
            maxSum = Math.max(maxSum, twinSum);
            first = first.next;
            second = second.next;
        }

        return maxSum;
    }

    // Utility: Print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // ✅ Main method
    public static void main(String[] args) {
        // Manually create: 4 -> 2 -> 2 -> 3
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);

        System.out.print("Original List: ");
        printList(head);

        int result = pairSum(head);
        System.out.println("Maximum Twin Sum: " + result);
    }
}
