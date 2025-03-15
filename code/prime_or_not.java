import java.util.Scanner;

public class prime_or_not {
    public static void main(String[] args) {
        int  i ;
        System.out.print("Enter a Number : 2");
              Scanner sc=new Scanner(System.in);
             int n=sc.nextInt();
              if (n==2) {
                System.out.println(  "n is a prime number");
              }
              else{
                boolean isprime=true;
                for(i=2; i<=n-1; i++){

                   if(n%i==0){
                    isprime =false;
                   }
                }
                if(isprime==true){
                    System.out.println("n is prime");
                }
                else{
                    System.out.println("n is not a prime");
                }

              }

    }

}
