public class arms {

public static void armstrong(int num) {
    int result=0;
    int origina_number=num;
    while (num>0) {
        int digit=num%10;
        result=result+ (int)Math.pow(digit, 3);
        num= num/10;
        
    }
    if (result==origina_number) {
        System.out.println("the number is palindrome");
        
    }
    else{
        System.out.println( "the number is not palindrome " );
    }
}


    public static void main(String[] args) {
        armstrong(155);
    }
    
}
