public class Max_Min {


    public static void FindMaxandMin(int[] arr){
        if(arr==null || arr.length==0){
            return;
        }
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            min=Math.min(min, arr[i]);
            max=Math.max(max, arr[i]);
        }
        System.out.println(max+ ": maximum");
        System.out.println(min+ " :minimum");

    }
    public static void main(String[] args) {
        int[] arr={1,3,8,5,7,9};
        FindMaxandMin(arr);
    }
    
}
