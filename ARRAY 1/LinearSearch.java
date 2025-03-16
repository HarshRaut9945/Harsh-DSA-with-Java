public class LinearSearch {
    public static int linearSearch(int number[], int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={1,2,4,6,8,5};
         int key=6;
         int index= linearSearch(number, key);
         System.out.println("the index are " +index);

    }
    
}
