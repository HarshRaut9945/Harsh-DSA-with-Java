public class lark {
    public static void main(String[] args) {
        String fruite[]={"Apple","mango","banana"};
        String largest=fruite[0];

        for(int i=0;i<fruite.length;i++){
            if(largest.compareTo(fruite[i])<0){
                largest=fruite[i];
            }
    
        }
        System.out.println(largest);      
 
    }
    
}
