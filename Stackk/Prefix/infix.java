import java.util.Stack;

public class infix {
    public static void main(String[] args) {
        String Str = "9-(5+3)*4/6";    // 4
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < Str.length(); i++) {
            char ch = Str.charAt(i);
            int assci = (int) ch;

            if (assci >= 48 && assci <= 57) {
                val.push(assci - 48);
            } else if (op.size() == 0 || ch=='(' || op.peek()=='(' ) {
                op.push(ch);
            }
            else if(ch==')'){
                  while(op.peek()!='('){
                    //work
                       int v2 = val.pop();
                    int v1 = val.pop();
                    if (op.peek() == '-') val.push(v1 - v2);
                    else if (op.peek() == '+') val.push(v1 + v2);
                    else if (op.peek() == '*') val.push(v1 * v2);
                    else if (op.peek() == '/') val.push(v1 / v2);

                    op.pop();
                  
                  }
                  op.pop();  //'(' hata diya
            }
             else {
                if (ch == '+' || ch == '-') {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if (op.peek() == '-') val.push(v1 - v2);
                    else if (op.peek() == '+') val.push(v1 + v2);
                    else if (op.peek() == '*') val.push(v1 * v2);
                    else if (op.peek() == '/') val.push(v1 / v2);

                    op.pop();
                    op.push(ch);
                }

                if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {     
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if (op.peek() == '*') val.push(v1 * v2);
                        else if (op.peek() == '/') val.push(v1 / v2);

                        op.pop();
                        op.push(ch);
                    } else {
                        op.push(ch);
                    }
                }
            }
        }

        // 🔁 Moved final evaluation here (outside the loop)
        while (!op.isEmpty()) {
            int v2 = val.pop();
            int v1 = val.pop();
            char opr = op.pop();
            if (opr == '+') val.push(v1 + v2);
            else if (opr == '-') val.push(v1 - v2);
            else if (opr == '*') val.push(v1 * v2);
            else if (opr == '/') val.push(v1 / v2);
        }

        System.out.println(val.peek());
    }
}
