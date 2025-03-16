public class MAXarray {
    public static int largest(int arr[]){
        int max=0 ;
       
        for(int i=0; i<arr.length; i++){
            if(max <  arr[i]){
               max=arr[i];
              
            }
         
        }
     
        System.out.println("the largest value are " +max);
        return max;
        
    }
    public static int loest(int arr2[]){
      
        int min=0;
        for(int i=0; i<arr2.length; i++){
            if(min< arr2[i]){
               min=arr2[i];
              
            }
           
        }
     
        System.out.println("the lowest value are " +min);
        return min;
        
    }

       
    public static void main(String[] args) {
        int arr[]={5,8,7,3};
        int arr2[]={1,8,5,4};
        largest(arr);
        loest(arr2);
     
        
    }
    
}
