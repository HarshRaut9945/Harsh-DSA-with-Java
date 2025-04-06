//subsequence question without using Arraylist
class str06{
    static void printssq(String s,String currAns){  //"s=abc", currans=""
        char curr=s.charAt(0); //a
        String remString=s.substring(1);
        // Base case: if the string is empty, print the current answer and return
        if(s.length()==0){
            System.out.println(currAns); //bc,a
            return;
        } 
    
        // Curr char-> choose to be part of currAns
        printssq(remString, currAns+curr); // bc,a

        //cuur char-> not choose to be part of currAns
        printssq(remString, currAns);  //bc,""
    }
public static void main(String[] args) {
    printssq("abc",""); //bc,a
    // The first call will include the first character 'a' in the current answer, and the second call will exclude it. 
}
}