public class LinkedListImplement {

    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val=val;
        }
}
        public static class  QueueL{
             Node head=null;
             Node tail=null;
             int size=0;

             public void add(int x){
                Node temp=new Node(x);
                if(size==0){
                    head=tail=temp;
                    
                }else{
                    tail.next=temp;
                    tail=temp;
                }
                size++;
             }
             public int  remove(){
                if(size==0){
                    System.out.println("queue is EMpty !");
                    return -1;
                }
                int x=head.val;
                head=head.next;
                return x;
             }
             public int peek(){
                 if(size==0){
                    System.out.println("queue is EMpty !");
                    return -1;
                }
                return  head.val;
             }
   
                 public  void Display(){
                     if(size==0){
                    System.out.println("queue is EMpty !");
                    System.out.println("queue is EMpty !");
                    return ;
                }
                    Node temp=head;
                    while(temp!=null){
                        System.out.print(temp.val+" ");
                        temp=temp.next;
                    }
                    System.out.println();
                 }
            
        }
    
    public static void main(String[] args) {
        QueueL hr=new QueueL();
       hr.Display();
       hr.add(12);
       hr.add(13);
       hr.add(14);
       hr.add(121);
       hr.Display();
       hr.remove();
       hr.Display();
       System.out.println(hr.peek());

    }
    
}
