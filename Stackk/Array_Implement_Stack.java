


class Array_Implement_Stack{

    public static class Stack{

        private int[] arr=new int[15];
        int idx=0;

        void push(int x){

            if(isfull()){
                System.out.println("Stack id full ");
                return;
            }

            arr[idx]=x;
            idx++;
        }

        int Peak(){
            if(idx==0){
                System.out.println("Stack is empty");
                   return -1;
            }
            return arr[idx-1];
        }
         
        int pop(){

            if(idx==0){
                System.out.println("Stack is empty");

            }
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        int size(){
         return  idx;
        }

        boolean isEmpty(){
            if(idx==arr.length)  return  true;
            return  false;
        }

        boolean isfull(){
            if(idx==arr.length) return true;
            return false;
        }

        void Display(){
            for(int i=0;i<=idx-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
       Stack sc=new Stack();

       sc.push(5);
       
       sc.push(6);
        sc.Display();
       sc.push(8);
        
       sc.push(15);
       
       
       sc.push(25);
       sc.push(35);
       sc.push(45);
       sc.Display();
      System.out.println(sc.Peak()); 
      
       sc.pop();
       sc.Display();


       

       

       
       

     
        
    }
}





