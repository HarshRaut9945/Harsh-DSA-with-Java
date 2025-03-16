public class inherit {
    public static void main(String[] args) {
        // fish shark=new fish();
        // shark.eat();
        // shark.breadth();
        // shark.swim();
        buffalo kk=new buffalo();
        kk.breadth();
        kk.breadth();
        kk.eat();
    }
}
 class Animai{
    String color;
    void eat(){
        System.out.println("Animal is not make their own food its depend upon other animal ");
    }
    void breadth(){
        System.out.println("breadth");
    }
 }
 class fish extends Animai{
    int finsh;
    void swim(){
        System.out.println("swim in water");
    }
 }
 class buffalo extends Animai{
    void run(){
        System.out.println("bufallo is runninng");
    }
 }
 class tiger extends Animai{
    void met(){
        System.out.println("tiger is enjoying with her girlfriend");
    }
 }