public class LL_implement_Stack {

    // Node class to represent each element in the stack
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    // Stack class with push, pop, peek, and display methods
    public static class Stack {
        Node head = null;
        int size = 0;

        // Push element onto the stack (insert at head)
        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        // Peek at the top element
        int peek() {
            if (head == null) {
                System.out.println("Stack is empty!");
                return -1;
            }
            return head.val;
        }

        // Pop the top element
        int pop() {
            if (head == null) {
                System.out.println("Stack is empty!");
                return -1;
            }
            int data = head.val;
            head = head.next;
            size--;
            return data;
        }

void diplsyrec(Node h){
    if(h==null ) return ;
    diplsyrec(h.next);
    System.out.print(h.val + " ");
}
void display(){
       diplsyrec(head);
       System.out.println();
}

        // Display all elements in the stack from top to bottom
        void displayRev() {
            Node temp = head;
            System.out.print("Stack: ");
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // Return size of the stack
        int getSize() {
            return size;
        }
    }

    public static void main(String[] args) {
        Stack sc = new Stack();

        // Push elements
        sc.push(5);
        sc.push(6);
        sc.push(8);
        sc.push(15);
        sc.push(25);
        sc.push(35);
        sc.push(45);

        sc.display();                    // Output: Stack: 45 35 25 15 8 6 5
        System.out.println("Top: " + sc.peek());  // Output: Top: 45

        sc.pop();                        // Remove top element
        sc.display();                    // Output: Stack: 35 25 15 8 6 5
        System.out.println("Size: " + sc.getSize()); // Output: Size: 6
    }
}
