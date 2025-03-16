public class insertion {
    
    public static void sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key) {
                //shifting
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    } 
    public static void addarr(int arr[]){
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    }
    public static void main(String[] args) {
      int   arr[]={5,6,2,3,1};
      sort(arr);
      addarr(arr);

    }
}
