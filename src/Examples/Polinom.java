package src.Examples;

import java.util.Scanner;

public class Polinom {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter value a");
        int a=s.nextInt();
        System.out.println("enter value b");
        int b=s.nextInt();
        System.out.println("enter value c");
        int c=s.nextInt();

        a=a*a;
        b=b*b;
        c=3*c;
        int result= a + b + c;
        System.out.println(result);
    }
}
