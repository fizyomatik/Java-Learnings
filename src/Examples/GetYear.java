package src.Examples;

import java.time.Year;
import java.util.Date;
import java.util.Scanner;

public class GetYear {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("type the current year: ");
        int year=s.nextInt();
        System.out.println("type your age : ");
        int age=s.nextInt();

        int birthDay = year - age;
        System.out.println(birthDay);


    }
}
