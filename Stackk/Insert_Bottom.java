import java.util.Stack;

public class Insert_Bottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);
        Stack<Integer> gt = new Stack<>();

        while (st.size() > 0) {
            gt.push(st.pop());
        }
        st.push(100);

        while (gt.size() > 0) {
            st.push(gt.pop());
        }
        System.out.println(st);

    }
}
