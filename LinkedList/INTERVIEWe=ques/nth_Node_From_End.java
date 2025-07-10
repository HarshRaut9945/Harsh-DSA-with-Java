

public class nth_Node_From_End {
 public static class Node{
        int data;
        Node next; // adress of next data 
        Node(int data ){
            this.data=data;
        }
    }

    //           //this is not optimised method because we are traversing two time
    //   public   static Node  nthFromLast(Node head,int n){
    //     int size=0;
    //     Node temp=head;
    //     while(temp!=null){
    //         size++;
    //         temp=temp.next;
    //     }
    //     int m=size-n+1;       //nth from the last
                  
    //     temp=head;
    //     for(int i=1;i<m;i++){
    //         temp=temp.next;

    //     }
    //     return  temp;
       
    //   }

         // same question with optimesed ways means we used only one traversal 

         public static Node nthNode2(Node head,int n){
            
             Node  slow=head;
            Node  fast=head;

            for(int i=1;i<=n;i++){
                fast=fast.next;
            }

            while(fast!=null){
                fast=fast.next;
                slow=slow.next;
            }
            return  slow;

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

        Node q =nthNode2(a, 3);
        System.out.print(q.data);
      
    }
}
