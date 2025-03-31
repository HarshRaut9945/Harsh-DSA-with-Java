public class MaxArr {
    static  int maxarr(int[] arr, int idx){
        if(idx==arr.length-1){
            return  idx;
        }
        // self work
        int smallans=maxarr(arr, idx+1);
        return  Math.max(arr[idx], smallans);
    }
    public static void main(String[] args) {
        int arr[]={2,3,9,1,7,64,5,4};
    System.out.println(maxarr(arr, 0));   
    }
}
