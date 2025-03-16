public class INTERFACEe {
    public static void main(String[] args) {
        queen  q= new queen();
         q.moves();
    }
    
}
 interface cheesePlayer{
    void moves();
 }
class queen implements cheesePlayer{
    public void moves(){
        System.out.println("quuen is cheese");
    }
}
  class king implements cheesePlayer{
    public void moves(){
        System.out.println("king in cheese");
    }
  }
  class haati implements cheesePlayer{
    public void moves(){
        System.out.println("hatti in cest");
    }
  }
