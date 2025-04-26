class selection{

    static void selectionsort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){           // Outer loop: runs from 0 to n-2

            int min_index=i;   // Assume the current position i is the index of the minimum element
            for(int j=i+1;j<n;j++){            // Inner loop: find the index of the minimum element in the remaining unsorted part
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }

            // After inner loop, swap the smallest found element with the element at position i
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={6,8,7,2,5,4,3,1};
        selectionsort(arr);
        for(int hh:arr){
            System.out.print(hh+ " ");
        }

    }
}