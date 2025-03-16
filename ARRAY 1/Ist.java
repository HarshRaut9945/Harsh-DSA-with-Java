

import java.util.Scanner;



public class Ist {
    public static void main(String[] args) {
        int marks[]=new int[100];
        Scanner sc=new Scanner(System.in);
      

        System.out.print("enter the physics marks");
        marks[0]=sc.nextInt();
        System.out.print("enter the chemestry mark");
        marks[1]=sc.nextInt();
        System.out.print("entrt the math marks");

System.out.println("physics marks" +marks[0]);
System.out.println("chemestry marks" +marks[1]);
System.out.println("math marks" +marks[2]);

    }
    
}
