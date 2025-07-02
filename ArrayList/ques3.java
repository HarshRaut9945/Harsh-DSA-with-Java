
import java.util.ArrayList;

//Two Sum Problem -> Two pointer Approch
public class ques3 {

 static boolean  TwoSum(  ArrayList<Integer> list,int target){

       int Lp=0;
       int Rp=list.size()-1;
       while(Lp<Rp){
         if(list.get(Lp)+list.get(Rp) ==target) {
               return true;
         }else if(list.get(Lp)+list.get(Rp)<target){
            Lp++;
         }else{
            Rp--;
         }
       }
       return  false;
 }


    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
               list.add(3);
               list.add(5);
               list.add(6);
               list.add(8);
               list.add(10);
               list.add(12);
               System.out.println(TwoSum(list, 11));

    }
    
}
