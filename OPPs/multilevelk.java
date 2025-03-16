public class multilevelk {
    public static void main(String[] args) {
    Divis Hr=new Divis();
    Hr.sum(5, 2);
    Hr.subtract(5, 2);
    Hr.multi(5, 2);
    Hr.div(8, 2);
    }
}
class Addition{
    void sum(int a,int b){
        int c=a+b;
        System.out.println("the sum is :"+c);
    }
    void subtract(int a,int b){
        int c=a-b;
        System.out.println("the subtraction is :"+c);
    }
}
class multiplica extends Addition{
    void multi(int a,int b){
        int c=a*b;
    System.out.println("the multiplication is: "+c);
    }
}
class  Divis extends multiplica{
    void div(int a,int b){
        int c=a/b;
        System.out.println(c);
    }
}