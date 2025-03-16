public class pattern8 {

    public static void halloRombus(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //for space 
            for( int j=1; j<=(n-i); j++){
                     System.out.print(" ");
            }
            for (int j=1; j<=n;j++){
                if ( i==1 || i==n || j==1 || j==n) {
                    //star
                    System.out.print("*");
                    
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
     halloRombus(5);   
    }
    
}
