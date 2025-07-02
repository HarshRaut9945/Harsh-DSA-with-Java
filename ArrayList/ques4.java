import java.util.ArrayList;
 //pair sum 2
public class ques4 {

    static  boolean pairSum2(  ArrayList<Integer> list,int target){
      int n=list.size();
  int bp=-1 ;
    
  for(int i=0;i<list.size()-1;i++){
    if(list.get(i)>list.get(i+1)){   //breaking point
        bp=i;
        break;    
    }
  }

    int  lp=  bp+1;
      int rp=bp;
      while(lp!=rp){
        //case 1
        if(list.get(lp)+ list.get(rp)==target) {
            return true;
        } else if(list.get(lp)+ list.get(rp)<target) {
                  lp=(lp+1)%n;

        } else{
            rp=(n+rp-1)%n;
        }
      }
      return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        
            System.out.println(pairSum2(list, 188));
            
            
            
        
    }

}
