//Find All Indices  in java  
class indices {
    static void findindices(int arr[], int target, int idx) {
        if (idx >= arr.length) {
            return;
        }
        // Self Work
        if (arr[idx] == target) {
            System.out.print(idx + " ");
        }
        // Recursive Work
        findindices(arr, target, idx + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 4, 4, 2, 4, 7, 4 };
        int target = 4;
        findindices(arr, target, 0);

    }
}
