public class FibonaicSeries {

    public static int Fseries(int n) {
        // Base case
        if (n == 0 || n == 1)
            return n;
        // subproblem
        int prev = Fseries(n - 1);
        int prevprev = Fseries(n - 2);
        // Self Work
        return prev + prevprev;

    }

    public static void main(String[] args) {
         int n=6;
        for(int i=0;i<=n;i++){
            System.out.println(Fseries(i));
        }

       
        // System.out.print(("the fibonacci number at position  " + n+ " is : " + Fseries(n))); 
    }
}
