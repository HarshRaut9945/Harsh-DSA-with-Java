
// leetcode 237. Delete Node in a Linked List
//Input: head = [4,5,1,9], node = 5
// Output: [4,1,9]
// Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.

public class DeleteNode {
    
      public static class Node{
        int data;
        Node next; // adress of next data 
        Node(int data ){
            this.data=data;
        }
    }

    public static class LinkedList{
        Node head=null;
        Node tail=null;


        void insertAtEnd(int val){
        Node temp=new Node(val);
        if(head==null){
            head=temp;
           
        }else{
            tail.next=temp;
        }
        tail=temp;
        }
   

         void dELETE_given_Node(Node a){

            a.data=a.next.data;
            a.next=a.next.next;

         }
      
       
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList li=new LinkedList();
         li.insertAtEnd(10);
        li.insertAtEnd(20);
        li.insertAtEnd(30);
        li.insertAtEnd(35);

    Node nodeToDelete = li.head.next; // Assuming we want to delete the node with value 20
    li.dELETE_given_Node(nodeToDelete);
      
       
        
       li.display();
              
    }
}
