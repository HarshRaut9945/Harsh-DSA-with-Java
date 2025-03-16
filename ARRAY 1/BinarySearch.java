public class BinarySearch {

    public static int binarySearch(int numbers[], int key){
        int start=0;
        int end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){  //right
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
           return -1;
    }
    public static void main(String[] args) {
        
       int  numbers[]={2,3,4,6,8,10,12,14};
         int key=14;
         System.out.println("the element index is "+binarySearch(numbers, key));
    }
    
}
