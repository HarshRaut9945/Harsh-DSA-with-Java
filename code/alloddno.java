import java.util.Scanner;

public class alloddno {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        
        for(int i=1 ;i<=n; i=i+2){
            System.out.println("the odd no are " +i);
        }
        
    }
    
}
