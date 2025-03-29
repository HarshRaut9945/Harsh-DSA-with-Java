public class ArraySum {
    static int sumOfarray(int[] arr,int idx){
        if(idx==arr.length){
                    return 0;
        }
     int    smallAns=sumOfarray(arr, idx+1);
        return  arr[idx]+smallAns;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,2};
       System.out.println( sumOfarray(arr, 0));
    }
}
