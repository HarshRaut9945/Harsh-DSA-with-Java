// A rotated sorted array is a sorted array on which sorted operation has been performed  some no of times . Give a rotated sorted array,Find the minimum element follow 0 based indexing 
// input : [3,4,5,1,2]  then output ahould be 3

public class MinimumIndexOfRotated {
    static  int FindMinimum(int arr[]){
        int st=0;
        int n=arr.length;
        int end=arr.length-1;
        int ans=-1;
        while(st<=end){

            int mid=st+(end-st)/2;

            if(arr[mid]>arr[n-1]){
           st=mid+1;
            } else {
                ans=mid;
                end=mid-1;
            }
            
        }
       return ans;
    }
    public static void main(String[] args) {
        int arr[]={5,6,7,8,9,10,1,2,3,4};
            System.out.println(FindMinimum(arr));

        
    }
    
}
