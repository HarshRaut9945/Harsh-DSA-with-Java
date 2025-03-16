public class Kadanes {
    public static void MaxsubarraySum(int numbers[]){
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for( int i=0;i<numbers.length;i++){
            currentSum= currentSum + numbers[i];
            if (currentSum<0) {
             currentSum=0; 
            }
            maxSum= Math.max(maxSum, currentSum);
        }
        System.out.print("our max sub array sum is = " +maxSum);
    }
    public static void main(String[] args) {
         int numbers[] ={-2,-3, 4,2,5,-1,6} ;
        MaxsubarraySum(numbers);
        
    }
    
}
