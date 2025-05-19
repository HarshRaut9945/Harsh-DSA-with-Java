//Given an integer array ,move all the zeroes to the end of the array without changing the order of non-zero elements.

class MoveZero{
    public   static void  Movezero(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                      // If current element is zero and next is not, swap them
                if(arr[j]==0 && arr[j+1]!=0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={0,5,0,4,3,11};
       Movezero(arr);
       for(int H:arr){
         
        System.out.print(H+ "");
       }

    }
}