//   sum in alternate way
public class SeriesSum {

    static int  serieAlternate(int n){
        if(n==0) return n;

        if(n%2==0){
          return  serieAlternate(n-1)-n;
        }else{
           return serieAlternate(n-1)+n;
        }
    }
    public static void main(String[] args) {
       System.out.println(serieAlternate(10));
        
    }
}
