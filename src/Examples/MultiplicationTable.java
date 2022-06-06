package src.Examples;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter first number: ");
        int num1=s.nextInt();
        System.out.println("enter second number: ");
        int num2=s.nextInt();



        for (int i=1; i<=num1; i++){  //this is for Rows(Outer Loop)

            for (int j=1; j<=num2; j++){ // this is for Columns(Inner Loop)
                System.out.printf("%5s",i*j);
            }
            System.out.println();
        }
    }
}
