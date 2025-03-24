public class MutipOfN {
 static void MULTIPLE(int n,int k){
    if(k==1){
        System.out.println(n);
        return ;
    }
   MULTIPLE(n, k-1);
  System.out.println(n*k);
 }
    public static void main(String[] args) {
        MULTIPLE(5, 6);
    }
}
