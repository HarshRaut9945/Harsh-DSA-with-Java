public class insertion_At_tail {
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
      
      public static Node Instion_AT_taill(Node head,int x){
         Node temp=head;

         while(temp.next!=null){
            temp=temp.next;

         }

         Node t=new Node (x);

         temp.next=t;
         t.prev=temp;

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
     

         Display(a);
       
        Node newhead = Instion_AT_taill(a, 110);
        Display(newhead);
        
    }
}
