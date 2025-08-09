
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class ReverseQue {
    public static void main(String[] args) {
        Queue<Integer> Q=new LinkedList<>();
        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(4);
        Q.add(5);
        Stack<Integer> st=new Stack<>();
        System.out.println(Q+ " ");

        while(Q.size()>0){
            st.push(Q.remove());
        }
        while(st.size()>0){
            Q.add(st.pop());
        }
        System.out.println(Q+ " ");
    }
}
