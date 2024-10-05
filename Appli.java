package CarRentalSystem;

import java.util.Scanner;

public class Appli {

        public static  int add(int a,int b)
        {
            return a+b;
        }

        public static double add(double a, double b)
        {
            return a+b;
        }
        //example of compile time polymorphism
        static Scanner sc=new Scanner(System.in);

        public static void main(String[]args)
        {
            System.out.println("enter the number in form 0f eg:(2,3)");
            Integer a=sc.nextInt();
            Integer b= sc.nextInt();
        System.out.println(add(a,b));

        System.out.println("enter the number in same as earlier");
        Double c= sc.nextDouble();
        Double d= sc.nextDouble();
        System.out.println(add(c,d));
        }

}

