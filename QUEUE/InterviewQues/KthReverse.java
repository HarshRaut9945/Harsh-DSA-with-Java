import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class KthReverse{
public static void main(String[] args) {
    int k=3;
    
         Queue<Integer> Q=new LinkedList<>();
         
        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(4);
        Q.add(5);
        int n=Q.size();
        Stack<Integer> st=new Stack<>();
        
      for(int i=0;i<k;i++){
        st.push(Q.poll());
      }
            while(st.size()>0){
                Q.add(st.pop());
            }
            for(int i=0;i<n-k;i++){
                Q.add(Q.poll());
            }
            System.out.println(Q);
}
}