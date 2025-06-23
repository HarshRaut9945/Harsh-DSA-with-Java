public class Bsearch {

    static int binarySearch(int arr[],int target){
        int st=0;
        int end=arr.length-1;
        while(st<=end){
            int mid=(st+end)/2;
        
            if(arr[mid]==target){
                return  mid;

            }
            if(arr[mid]>target){
                 end=mid-1;
            }else{
               st=mid+1;
            }
        }
  return -1;
    }
    public static void main(String[] args) {
        int arr[]={3,4,6,7,9,10,14,15};
        int target=10;
      System.out.print(binarySearch(arr, target));  
    }
}