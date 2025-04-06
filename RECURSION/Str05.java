import java.lang.reflect.Array;
import java.util.ArrayList;

class Str05{
    static  ArrayList<String> getSSq(String s){
        ArrayList<String> ans = new ArrayList<>();
        // Base case: if the string is empty, return a list with an empty string
        if(s.length()==0){
            ans.add(" ");
            return ans;
        }

        char curr= s.charAt(0); // first character of the strin
        ArrayList<String> smallans=getSSq(s.substring(1));// recursive call to get the subsequences of the remaining string
        
        for(String ss:smallans){
            ans.add(ss);
            ans.add(curr+ss);

        }
        return ans;
        
        

    }
public static void main(String[] args) {
    ArrayList<String> ans = getSSq("abc");
    for(String ss:ans){
        System.out.println(ss);
    }
}
}