class PeakElement{
// FIND PEAK ELEMENT

    static int FindPeak(int arr[]) {
    int n = arr.length;
    int st = 0;
    int end = n - 1;

    while (st <= end) {
        int mid = st + (end - st) / 2;
        if ((mid==0 ||arr[mid] > arr[mid - 1]) && (mid ==n-1 || arr[mid] > arr[mid + 1])) {
            return mid;

        } else if (arr[mid] < arr[mid + 1]) {
            st = mid + 1;
        } else {
            end = mid - 1;
        }

    }
    return -1;

}
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3,  1 };
        System.out.println(FindPeak(arr)); //

    }
}