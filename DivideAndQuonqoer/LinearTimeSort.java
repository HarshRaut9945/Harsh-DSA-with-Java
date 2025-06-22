public class LinearTimeSort {
 static void linearsort(int[] num){
    // Sorting logic goes here
    int n=num.length;
    int x=-1,y=-1;
    for(int i=1;i<n;i++){
        if(num[i-1]>num[i]){
            if(x==-1){
                x=i-1;
                y=i;

            }else{
                y=i;
            }
        }
    }
    int temp=num[x];
    num[x]=num[y];
    num[y]=temp;

 }
  static void displayarr(int arr[]) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        int num[]={10,5,6,7,8,9,3};
        linearsort(num);
        displayarr(num);

    }
} 