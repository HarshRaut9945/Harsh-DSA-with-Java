   // add node at  begining of linked list  
public class AddBeg {
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

        void InsertAtBeg(int val){
            Node temp=new Node(val);
            if(head==null){
                head=tail=temp;

            }else{
                temp.next=head;
                head=temp;

            }
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

        li.InsertAtBeg(24);
        
       li.display();
    }
}
