
import javax.sound.sampled.SourceDataLine;

public class Str03 {
    static Boolean palindrome(String s,int l,int r){
        //Base case
        if(l>=r){
            return true;
        }
        //Recursive case
      return (s.charAt(l)==s.charAt(r)  && palindrome(s,l+1,r-1));

       


    }
    public static void main(String[] args) {
        // Your code here
        String s="dad";
            //   palindrome(s, 0, s.length()-1);
              System.out.println(palindrome(s, 0, s.length()-1));
              System.out.println(".()");
              System.out.println(".()");
                System.out.println(".()");
                

    }
}