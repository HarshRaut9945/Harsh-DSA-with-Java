//insertion at head 

public class insertion {
    
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
      
      public static Node Insertionathead(Node head,int x){

              Node t = new Node(x);
              t.next = head;
              if (head != null) {
                  head.prev = t;
              }
              head = t;
              return head;              
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
     
       
        Node newhead = Insertionathead(a, 35);
        Display(newhead);
        
    }
}