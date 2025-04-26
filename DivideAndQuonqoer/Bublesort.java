public class Bublesort {

    static void   buble(int a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            boolean flag=false; 
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            if(!flag){
                return;  // If no two elements were swapped in the inner loop, then the array is already sorted
            }
        }
    }
    public static void main(String[] args) {
        int a[]={5,1,3,6,7};
        buble(a);
        for(int r:a){
            System.out.print(r+ " ");
        }
    }
    
}
