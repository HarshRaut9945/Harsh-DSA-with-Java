public class printarr {
    static void Printarr(int[] arr, int idx) {
        if (idx == arr.length) {
            return; // Base case: stop when idx reaches array length
        }
        System.out.println(arr[idx]); // Print current element
        Printarr(arr, idx + 1); // Recursive call with next index
    }

    public static void main(String[] args) {
        int arr[] = {4, 6, 7, 8, 2, 1};
        Printarr(arr, 0); // Start with idx = 0
    }
}