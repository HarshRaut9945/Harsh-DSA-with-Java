
//Given an arrya name of fruit ,you suppose to sort the array in lexicographicla order 
public class LexicographicalOrder {
    public static void lexio(String arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
      int  min_index=i;
            for(int j=i+1;j<n;j++){
               if(arr[j].compareTo(arr[min_index])<0){
                    min_index=j;
                }
        }
        // Swap the found minimum element with the first element
        String temp=arr[i];
        arr[i]=arr[min_index];
        arr[min_index]=temp;
        }
    }
    
    public static void main(String[] args) {
        String[] fruits = {"banana", "apple", "orange", "kiwi", "grape"};
        lexio(fruits);
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }

        
    }
}