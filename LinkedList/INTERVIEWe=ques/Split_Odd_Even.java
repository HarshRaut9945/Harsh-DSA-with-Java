public class Split_Odd_Even {
       public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    `
    public static void splitList(ListNode head, ListNode[] oddEven) {
        ListNode oddDummy = new ListNode(-1);  // dummy for odd list
        ListNode evenDummy = new ListNode(-1); // dummy for even list

        ListNode oddTail = oddDummy;
        ListNode evenTail = evenDummy;

        while (head != null) {
            if (head.val % 2 == 0) {
                evenTail.next = head;
                evenTail = head;
            } else {
                oddTail.next = head;
                oddTail = head;
            }
            head = head.next;
        }

        
        oddTail.next = null;
        evenTail.next = null;

        oddEven[0] = oddDummy.next;
        oddEven[1] = evenDummy.next;
    }

    
    public static void printList(String label, ListNode head) {
        System.out.print(label + ": ");
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    
    public static void main(String[] args) {
        
        ListNode head = new ListNode(1,
                          new ListNode(4,
                          new ListNode(5,
                          new ListNode(2,
                          new ListNode(7,
                          new ListNode(8))))));

    
        ListNode[] oddEven = new ListNode[2];
        splitList(head, oddEven);

        // Print results
        printList("Odd List", oddEven[0]);
        printList("Even List", oddEven[1]);
    }
}
