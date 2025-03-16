public class Palindrome {
    static boolean pallindrom(String str){
        int n=str.length();
        for(int i=0;i<str.length()/2;i++){
           
            if(str.charAt(i)!=str.charAt(n-i-1)){
             System.out.println(" Not a plindrome");   
             return false;
           }
            }
            System.out.println("It is a plaindrome");
            return true;
    }
    public static void main(String[] args) {
        String str="noon";
        pallindrom(str);
    }
    
}
