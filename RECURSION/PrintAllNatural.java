public class PrintAllNatural {

  public  static void PDecrease(int n){
 if(n==1){
    System.out.println(1);
    return;
 }
 
//  self work
System.out.println(n);
// recursive work
    PDecrease(n-1);
    
    }
public static void main(String[] args) {
    PDecrease(5);
    
    
    
}
    
}