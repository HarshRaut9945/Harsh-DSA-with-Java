import java.util.ArrayList;
public class ques2 {
   
    static int storeWater(ArrayList<Integer> height){
        
        int lp=0;
        int Rp=height.size()-1;
        int maxWater=0;
         while(lp<Rp){
            
            
           int ht=Math.min(height.get(lp),height.get(Rp));
           int width= Rp-lp;
           int currWater= ht *width;

          maxWater=Math.max(maxWater, currWater);

          if(height.get(lp)<height.get(Rp)){
            lp++;
          }else{
            Rp--;
          }

         }
         return  maxWater;
    }


    public static void main(String[] args) {
         ArrayList<Integer> height= new ArrayList<>();
    height.add(1);
    height.add(8);
    height.add(6);
    height.add(2);
    height.add(5);
    height.add(4);
    height.add(8);
    height.add(3);
    height.add(7);
    System.out.println("Maximum water stored: " + storeWater(height));
    }

    
}
