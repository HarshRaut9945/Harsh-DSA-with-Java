//160. Intersection of Two Linked Lists
public class Intersection {
  
    public static  class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;

        }
          
    }

    public static Node InstersctionNode(Node headA,Node headB ){
        Node tempA=headA;
        Node tempB=headB;

        int lenA=0;
        int lenB=0;

        while(tempA!=null){
            lenA++;
            tempA=tempA.next;
        }
        while(tempB!=null){
            lenB++;
            tempB=tempB.next;
        }
         tempA=headA;
         tempB=headB;

         if(lenA>lenB){
            int step=lenA-lenB;
            for(int i=1;i<=step;i++){
                tempA=tempA.next;
            }

         }else{
            int step=lenB-lenA;
            for(int i=1;i<=step;i++){
                tempB=tempB.next;

            }
         }

         while(tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
         }
         return  tempA;
        }                       
           public static void main(String[] args) {
        // Create common intersection node
        Node common = new Node(8);
        common.next = new Node(10);

        // List A: 3 -> 7 -> 8 -> 10
        Node headA = new Node(3);
        headA.next = new Node(7);
        headA.next.next = common;

        // List B: 99 -> 1 -> 8 -> 10
        Node headB = new Node(99);
        headB.next = new Node(1);
        headB.next.next = common;

        Node intersection = InstersctionNode(headA, headB);
        if (intersection != null) {
            System.out.println("Intersection at node with data: " + intersection.data);
        } else {
            System.out.println("No intersection.");
        }
    }
    }

