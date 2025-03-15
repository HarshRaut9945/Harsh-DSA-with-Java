import java.util.Scanner;

public class sitchcase {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter youe age ");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        switch (age) {
            case 18:
            System.out.println("Your age is going to become an adult");
                
                break;
                case 23:
                System.out.println("YOur age ijoin a jobs  ");
                break;
                case 60:
                System.out.println("now you are getting retire");
                break;
        
            default:
            System.out.println("ENjoy youe life");
                break;
        }


    }
    
}
