//GIven an array of positive and negative number interger ,segerated them in a linear time & constant space .The output of Sould Print all negative Number followed by all positive number
public class SortPostNeg {

    static void soLinear(int arr[]) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        while (l < r) {
            while (arr[l] < 0)
                l++;
            while (arr[r] >= 0)
                r--;

            if (l < r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
    }

        }

    }

    static void displayarr(int arr[]) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 19, -20, 17, -4, -13, 11, -5, 3 };
        soLinear(arr);
        displayarr(arr);

    }

}