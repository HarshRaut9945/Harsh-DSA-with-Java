import java.util.Stack;
public class Reverse {
    public static void main(String[] args) {
        
        Stack <Integer> st=new Stack <>();

        st.push(1);
        st.push(3);
        st.push(4);
        st.push(6);
        st.push(7);

        System.out.println(st);

          Stack <Integer> hr=new Stack <>();

          while(st.size()>0){
             hr.push(st.pop());
          }

          System.out.println(hr);
            
    }
    
}
