public class pattern5 {

    public static void Zeoro_one_triangle(int n){
        for(int i=1;i<=n;i++){
            for( int j=1;j<=i;j++){ 

                if ((i+j)%2==0) {
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Zeoro_one_triangle(5);
    }
    
}
