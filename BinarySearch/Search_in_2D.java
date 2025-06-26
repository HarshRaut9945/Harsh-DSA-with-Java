public class Search_in_2D {
    // You can add methods and logic here for searching in a 2D array

    static boolean  Search(int arr[][],int targett){
        int n=arr.length;   //no of row 
        
        int m=arr[0].length;   //no of coloum
        int st=0;   int end=n*m-1;

        while(st<=end){
            int mid=st+(end-st)/2;
            int midElt=arr[mid/m][mid%m];
            if(targett==midElt){    // Map virtual index to 2D index and get the value
                return  true;
                 }
           else if(targett>midElt){
                st=mid+1;
            }
            else{
                end=mid-1;
            }

       
        }
        return false;

    }
    public static void main(String[] args) {
        int arr[][]={{1,3,5},{10,11,16,20},{23,30,34,60}};
        System.out.print(Search(arr, 11));
    }
}