
import javax.sound.sampled.SourceDataLine;


public class Linearsearch {
    static Boolean LinearSearch(int arr[], int target, int idx) {
        // Base case
        if (idx >= arr.length)
            return false;

        // self work
        if (arr[idx] == target)
            return true;
        //
        // Recursive call
        return LinearSearch(arr, target, idx + 1);

    }

    public static void main(String[] args) {
        // Your code here
        int arr[] = { 2, 4, 7, 8, 1, 10 };
        int target = 80;
        if (LinearSearch(arr, target, 0)) {
            System.out.println("Target found in the array.");
        } else {
            System.out.println("Target not found in the array.");
        
                
        }

    }
}
