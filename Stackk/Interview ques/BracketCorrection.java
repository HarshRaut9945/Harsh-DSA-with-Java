import java.util.Scanner;

public class   BracketCorrection { 

    public static int minRemovalsToBalance(String str) {
        int open = 0;
        int unmatchedClosing = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(') {
                open++;
            } else if (ch == ')') {
                if (open > 0) {
                    open--; // match found
                } else {
                    unmatchedClosing++; // unmatched closing
                }
            }
        }

        return open + unmatchedClosing; // total removals
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Brackets to remove to balance: " + minRemovalsToBalance(str));
    }
}
