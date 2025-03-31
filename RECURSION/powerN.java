                    //  x^n
public class powerN {

    static int Power(int x,int n){
        // Base Case
        if(n==0){
            return 1;
        }

        return   x * Power(x, n-1);
    }
    //  OPTIMESED WAY WHERE THE TIME-COMPEXITY=0(Logn)

    static   int OptimisedWay(int x,int n){
        if(n==0){
            return 1;
        }
        int halfpow=OptimisedWay(x, n/2);
      int halfpoeSq=halfpow*halfpow;

      if (n%2!=0){
        halfpoeSq=x*halfpoeSq;
      }
 
    
    return halfpoeSq;
}
    public static void main(String[] args) {
        System.out.println(Power(2, 5));
        System.out.println(OptimisedWay(2, 5));
        
    }
}
