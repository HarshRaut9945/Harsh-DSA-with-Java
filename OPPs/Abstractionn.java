public class Abstractionn {
    public static void main(String[] args) {
        // horse h=new horse();
        // h.Run();
        // h.eat();
    //   Harsh newharsh=new HARSH();
    HARSH newHarsh = new HARSH();

    }
    
}
   abstract class Animal{
    Animal() {
        System.out.println("Animal constructor is caleed");
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void Run();
}
class horse extends Animal{
    horse(){
        System.out.println("hors constructor is called");
    }
    void Run(){
        System.out.println("horse is running using 4 leg");
    }
}

class Tiger extends Animal{
    void Run(){
        System.out.println("tiger is also running");
    }
}

class HARSH extends horse{
    HARSH(){
        System.out.println("harsh constructor si called");
    }
}
