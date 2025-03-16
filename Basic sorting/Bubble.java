

public class Bubble {
    public static void Bubblesort(int arr[]){
        for(int turn=0;turn<arr.length-1; turn++){
            for(int j=0;j<arr.length-1-turn; j++){
                
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
    }
    public static void addarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        Bubblesort(arr);
        addarr(arr);
        
    }
    
}
