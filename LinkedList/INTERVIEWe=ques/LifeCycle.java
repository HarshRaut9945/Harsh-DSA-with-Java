// leetcode-141  linked list cycle
public class LifeCycle {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

  
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) return true; // Cycle detected
        }

        return false; // No cycle
    }

    public static void main(String[] args) {
        // Create nodes
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        // Create cycle: 3 -> 2 -> 0 -> -4 -> 2 (cycle back to node2)
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // Cycle here

      
        boolean hasCycle = hasCycle(node1);
        System.out.println("Cycle detected: " + hasCycle); // Expected: true
    }
}
