package src.Examples;

import java.util.Scanner;

public class LogicalConnections {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("type the first number: ");
        int num1= a.nextInt();
        System.out.println("type the second number: ");
        int num2=a.nextInt();
        System.out.println("type the third number: ");
        int num3=a.nextInt();



        if (num1<num2 && num1<num3){
            System.out.println(num1 + ", "+ num2 + " and "+ num3+"'ten kucuktur. ");
        }else {
            System.out.println(num1 + " en kucuk sayi degildir...");
        }

    }
}
