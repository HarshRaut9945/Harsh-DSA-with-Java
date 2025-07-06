public class Insert_At_Middle {
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
   
        void Insert(int idx,int val){
            Node t=new Node(val);
            Node temp=head;
           
             for(int i=1;i<=idx-1;i++){
                temp=temp.next;
             }

             t.next=temp.next;
             temp.next=t;
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
        li.insertAtEnd(60);
        li.insertAtEnd(45);
        
       li.display();
       System.out.println();
       // Insert value 25 at index 2 (between 20 and 30)
       li.Insert(2, 25);
       li.display();
    }
    
}
