import java.util.Scanner;

public class sumEvenorOdd {

    public static void main(String[] args) {
        int n,i,sum=0;
        System.out.println("enter the range");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        if(n%2==0){
            for(i=0;i<=n;i=i+2){
                sum=sum+i;
            }
            System.out.println("the sum of even no" +sum) ;
        }
        else{
            for(i=1;i<=n;i=i+2){
                sum=sum+i;
            }
            System.out.println("the sum of odd e number are " +sum);
        }
        
    }
    
}
