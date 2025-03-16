

public class primekk {
    public static boolean ISprime(int n){
        if(n==2){
            // System.out.println("number is prime");
            return true;
        }
        // boolean isprime =true;
        for(int i=2;i<=n-1; i++){
            if (n%i==0) {
                return false;
            }    
        }
        return true;
    }
    public static void main(String[] args) {
        // System.out.println(ISprime(2));
        // int n=4;
         boolean a=ISprime(4);
         System.out.println(a);
        // if(a==true){
        //     System.out.println("Prime number " +n);
        // }else{
        //     System.out.println("not prime"+n);
        // }
    }
    
}
