
import java.util.ArrayList;
//pull
// Question -> Container with most Water    (Brute force approch) 
/*
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0).
Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Brute force approach: Check every possible pair of lines and calculate the area, keeping track of the maximum.
*/

public class ques1 {

    
    static int StoreWater(ArrayList<Integer> height){
             int maxWater=0;

             //brute force
    for(int i=0;i<height.size();i++){
        for(int j=i+1;j<height.size();j++){
            int ht=Math.min(height.get(i), height.get(j));
            int width=j-i;
            int currWater=ht*width;
            maxWater=Math.max(currWater, maxWater);
        }
    }
    return maxWater;

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
    System.out.println(StoreWater(height));
    }
}
