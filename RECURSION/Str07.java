public class Str07 {

    static void Sumsqq(int a[], int idx,int sum){
        if(idx>=a.length){
            System.out.println(sum);
            return;
        }
     Sumsqq(a, idx+1, sum+a[idx]);  // include the current element in the sum

     Sumsqq(a, idx+1, sum); // exclude the current element from the sum
 

        
    }
    public static void main(String[] args) {
        int a[]={2,4,5};
        Sumsqq(a, 0, 0);
    }
}
