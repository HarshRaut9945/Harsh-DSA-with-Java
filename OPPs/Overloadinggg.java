public class Overloadinggg {
    public static void main(String[] args) {
        Calculator C=new Calculator();
        
        System.out.println(C.sum(5, 3));
        // C.sum( 12.5, 17.5);
       System.out.println( C.sum(1, 02, 3));
       System.out.println(C.sum(22.5f, 55.6f));
        
    }
    
}
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}