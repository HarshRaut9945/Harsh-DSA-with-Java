public class Recursivee {
    static boolean RecurBinary(int arr[], int st, int end, int target) {
        if (st <= end) {

            int mid = (st + end) / 2;

            if (arr[mid] == target) {
                return true;

            } else if (target < arr[mid]) {
                return RecurBinary(arr, st, mid - 1, target);
            } else {
                return RecurBinary(arr, mid + 1, end, target);
            }
        }
        return false;
    }

    public static void main(String[] args) {
          int arr[]={3,4,6,7,9,10,14,15};
        int target=89;
        System.out.println(RecurBinary(arr, 0, arr.length - 1, target));
        
    }
}
