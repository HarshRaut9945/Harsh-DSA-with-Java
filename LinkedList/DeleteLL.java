// Delete linked at specific index 

public class DeleteLL {
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

        void Delete_At_idx(int idx){
            
            Node temp=head;
            for(int i=1;i<idx-1;i++){
                temp=temp.next;

            }
                temp.next=temp.next.next;
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
        li.Delete_At_idx(2 );

       
        
       li.display();
    }
}
