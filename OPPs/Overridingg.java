public class Overridingg {
    public static void main(String[] args) {
        // System.out.println("jj");
   deer jj=new deer();
   jj.eat();
    }
    
}

class Animal{
    void eat(){
        System.out.println("Animal eat anything");
    }
}
class deer extends Animal{
    @Override
    
    void eat(){
        super.eat();
        
      System.out.println("dear eat only grass");
    }
}