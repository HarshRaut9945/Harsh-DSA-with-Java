public class Basics {
    
    public static class Node{
        int data;
        Node next; // adress of next data 
        Node(int data ){
            this.data=data;
        }
    }

    public static int Length(Node head){
       
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
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
        System.out.println(Length(a));
    }
}
