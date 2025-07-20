public class basic {


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
  
    
     public static boolean  palindrme(Node head){
      Node temp=head;

      while(temp.next!=null){
        temp=temp.next;

      }
      Node h=head;
      Node t=temp;

      while(h!=t){
        if(h.val!=t.val) return false;

        h=h.next;
        t=t.prev;
      }
      return  true;
     }

    public static void main(String[] args) {

        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(30);
        Node e=new Node(20);
        Node f=new Node(10);

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
        
        if ( palindrme(a)) {
            System.out.println("The list is a palindrome.");
        } else {
            System.out.println("The list is NOT a palindrome.");
        }
    
       
        
    }

    
}
