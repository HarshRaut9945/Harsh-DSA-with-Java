import java.util.Scanner;
import java.util.Stack;

public class Balanced_Bracet {

    public static boolean isBalance(String str){
        Stack <Character> st=new Stack<>();
        int n=str.length();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);

            if(ch=='('){
                st.push(ch);
            }
            else if(ch==')'){
                if(st.isEmpty()){  //unmatch closing bracket
                    return false;
                }
                st.pop();         //found a matching opening
            }
            
        } 
        if(st.size()>0) return false;
        else return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your parenthesis");
        String str=sc.nextLine();
        System.out.println(isBalance(str));
    }
}
