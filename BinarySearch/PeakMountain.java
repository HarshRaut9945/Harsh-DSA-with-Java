public class PeakMountain {
    static int peakIndex(int[] arr ){
        int n=arr.length;
        int st=0;
        int end=n-1;
        int ans=-1;
        while(st<end){
            int mid=st+(end-st)/2;
            if(arr[mid]<arr[mid+1]){
                ans=mid+1;
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
        // No additional code needed here. Remove $PLACEHOLDER$.
    }
    public static void main(String[] args) {
        int arr[]={2,4,10,7,3,1,0};
    //    system.out.println(peakIndex(arr));
       System.out.println(peakIndex(arr));
    }
    
}
