package src.Emo;

import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter a day:");
        int day=s.nextInt();
        System.out.println("Please enter a month: ");
        int month=s.nextInt();
        System.out.println("Please enter a year: ");
        int year=s.nextInt();

        if(day>=31){
            System.out.println("please enter a valid number between 1 and 31 for the day: ");
            day=s.nextInt();

        }else {

        }
        if (month>13){
            System.out.println("Enter a valid number between 1 and 12 for the month: ");
            month=s.nextInt();

        }else {

        }
        System.out.println("day month year: " + day+"."+month+"."+year);
        System.out.println("month day year: "+ month+"."+day+"."+year);
        System.out.println("year month day: "+ year+"."+month+"."+day);
    }
}
