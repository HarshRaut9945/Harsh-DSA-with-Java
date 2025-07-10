// this question is we have to deltete front the last nth it is similar to frt nth but small change is in get we dol in while condition is fast!=null  but in this we have to just to do fast.next!=null isse prev data rahe hamare pass
public class Delete_From_Lastnth {
  public static class Node{
        int data;
        Node next; // adress of next data 
        Node(int data ){
            this.data=data;
        }
    }
      
       static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
       }
    

         public static void DeletenthNode2(Node head,int n){
            
             Node  slow=head;
            Node  fast=head;

            for(int i=1;i<=n;i++){
                fast=fast.next;
            }
          
             
            if(fast==null){
                head=head.next;
                return;
            }
            while(fast.next!=null){
                fast=fast.next;
                slow=slow.next;
            }
              slow.next=slow.next.next ;
             

         }
  
    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(5);
        Node c=new Node(7);
        Node d=new Node(9);
        Node e=new Node(12);
        Node f=new Node(19);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        display(a);
  
         DeletenthNode2(a, 1);

         display(a);
        
      
    }
}
