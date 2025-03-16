public class sumArray {

    public static void Sumarray(int[] arr){
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum=sum +arr[i];
        }
        System.out.println("the sum of array is " +sum);


    }
    public static void main(String[] args) {
        int[] arr={2,3,4};
        Sumarray(arr);
        
    }
    
}
