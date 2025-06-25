public class RotateSorted {

    static boolean duplicate(int arr[], int target) {
        int st = 0;
        int end = arr.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] == target) {
                return true;
            }

            // Handle duplicates on both sides
            if (arr[st] == arr[mid] && arr[end] == arr[mid]) {
                st++;
                end--;
            }

            // Right half is sorted
            else if (arr[mid] <= arr[end]) {
                if (target > arr[mid] && target <= arr[end]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            // Left half is sorted
            else {
                if (target >= arr[st] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = {0, 0, 0, 1, 1, 2, 0, 0, 0};
        int target = 2;
        System.out.println(duplicate(arr, target)); // Output: true
    }
}

