public class reaverseArray {
    public static int reverse(int numbers[]){
        int first=0;
        int last=numbers.length-1;
        System.out.println("the reverse array are");
        while (first<last) {
            int temp =numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            first++;
            last--;
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={4,658466,118,11,12,15};
        reverse(numbers);
        for(int i=0;i<numbers.length; i++){
           
            System.out.println(numbers[i] );
        }

        System.out.println();
    }
    
    
}
