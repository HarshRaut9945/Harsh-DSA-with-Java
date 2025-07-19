// insertion at specif index
public class insertion_At_specific {
    
  public static class Node{
       int val;
       Node next;
       Node prev;

       Node(int val){
        this.val=val;

       }

  }
    public static void  Display(Node head){

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void specific(Node head,int idx,int x){
        Node s=head;
    
         for(int i=1;i<=idx-1;i++){
            s=s.next;
         }
         Node r=s.next;
         Node t=new Node (x);
          
         s.next=t;
         t.prev=s;
         t.next=r;
         r.prev=t;

    }

    public static void main(String[] args) {

        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(15);
        Node e=new Node(60);
        Node f=new Node(100);

          a.prev = null;
        a.next = b;

        b.prev = a;
        b.next = c;

        c.prev = b;
        c.next = d;

        d.prev = c;
        d.next = e;

        e.prev = d;
        e.next = f;

        f.prev = e;
        f.next = null;
     

        Display(a);
        specific(a, 3, 91);
        Display(a);
        
    }
}
