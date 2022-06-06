package src.Examples;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println("enter number: ");
        Scanner s=new Scanner(System.in);
        int num1=s.nextInt();
        int a=1, b=1  ;
        System.out.printf("%5d %5d",a,b);

        for (int i=0; i<num1-2; i++){

            int c=a + b;
            System.out.printf("%5d",c);
            a=b;
            b=c;



        }

    }
}
