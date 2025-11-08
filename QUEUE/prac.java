public class prac {
    public static class HR{
        int f=-1;
        int r=-1;
        int size=0;
        int arr[]=new int[5];

        public void  add(int val) throws  Exception{
            if(size==arr.length){
                throw new Exception("queue is full");

            }
           else if(size==0){
                f=r=0;
                arr[r]=val;
            }
            else if(r<arr.length-1){
                arr[++r]=val;
            }
            else if(r==arr.length-1){
                r=0;
                arr[0]=val;
            }
            size++;
        }

        public int remove() throws Exception{
            if(size==0) {
                throw new Exception("queue is empty");
            }
            int val=arr[f];
            if(size==1){
                f=r=-1;
            }
        else if(f==arr.length-1){
                f=0;
            }
            else {
                f++;
            }
            size--;
            return val;

        }

        public int peek() throws Exception{
            if(size==0) {
                throw new Exception("queue is empty");
            }
            return arr[f];
            
        }

        public void Display(){
            if(size==0){
               System.out.println("quwuw is empty");
            }
            else if(f<=r){
                for(int i=f;i<=r;i++){
                     System.out.print(arr[i]);
                }
            }
            else if(r<f){
                for(int i=f;i<=arr.length-1;i++){
                     System.out.print(arr[i] +" ");
                }

                for(int i=0;i<=r;i++){
                     System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        } 
    }
    public static void main(String[] args) throws Exception {
        HR ab=new HR();
      
        ab.Display();  // Queue is empty
        ab.add(1);
        ab.add(5);
        ab.add(6);
        ab.add(7);
        ab.add(9);
        ab.Display();  // Full queue printed

        ab.remove();   // Remove 1
        ab.remove();   // Remove 5
        ab.Display();  // Should wrap correctly and show remaining

        ab.add(11);
        ab.add(13);
        ab.Display(); 
        ab.remove();
        ab.add(151);
         ab.Display(); 
        
        
    }
}
