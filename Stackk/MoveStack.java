import java.util.Scanner;
import  java.util.Stack;
public class MoveStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st= new Stack<>();
        int n;
        System.out.println("Enter the no of elemnt  ");
        n=sc.nextInt();
        System.out.println("Enter the elemnt : ");

        for(int i=1;i<=n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println(st);

        
    }
}
