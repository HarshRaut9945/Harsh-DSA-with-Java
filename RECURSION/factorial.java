public class factorial {

    static int  Fact(int n){
        //Base case
        if (n==0) return 1; 

        return n*Fact(n-1);

        // int smallans=Fact(n-1);
        // int ans=n*smallans;  
        // return ans;
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println(Fact(n));
        
        }
}
