public class QuickSort {

    // Swaps elements at positions x and y in the array
    static void Swap(int arr[], int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    // Partition function: places the pivot element at its correct position
    // and rearranges smaller and larger elements around it
    static int partition(int arr[], int st, int end) {

        int pivot = arr[st];  // Choosing the first element as the pivot
        int cnt = 0;

        // Count how many elements are less than or equal to pivot
        for (int i = st + 1; i <= end; i++) {
            if (arr[i] <= pivot)
                cnt++;
        }

        // Calculate the correct position of the pivot
        int pivotidx = st + cnt;

        // Move pivot to its correct position
        Swap(arr, st, pivotidx);

        // Initialize two pointers for rearranging other elements
        int i = st, j = end;

        // Move elements smaller than pivot to the left,
        // and larger to the right
        while (i < pivotidx && j > pivotidx) {
            // Find the first element from the left that is greater than pivot
            while (arr[i] < pivot)
                i++;

            // Find the first element from the right that is smaller than or equal to pivot
            while (arr[j] > pivot)
                j--;

            // Swap the misplaced elements
            if (i < pivotidx && j > pivotidx) {
                Swap(arr, i, j);
                i++;
                j--;
            }
        }

        // Return the index of pivot after correct placement
        return pivotidx;
    }

    // Recursive function to apply QuickSort on subarrays
    static void quiksort(int arr[], int st, int end) {
        if (st >= end)
            return;

        // Partition the array and get the pivot index
        int pi = partition(arr, st, end);

        // Recursively apply quicksort to left and right subarrays
        quiksort(arr, st, pi - 1);
        quiksort(arr, pi + 1, end);
    }

    // Utility function to print the array
    static void displayarr(int arr[]) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    // Main function to run the program
    public static void main(String[] args) {
        int arr[] = { 8, 2, 5, 1, 6, 7, 3, 6, 4, 9 }; // Unsorted array
        int n = arr.length;

        System.out.println("Before sorting:");
        displayarr(arr);

        // Apply QuickSort
        quiksort(arr, 0, n - 1);

        System.out.println("\nAfter sorting:");
        displayarr(arr); // Output sorted array
    }
}
