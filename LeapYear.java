import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the year: ");
        int leap=scan.nextInt();

        if (leap%4==0){
           if (leap%100==0){
               if (leap%400==0){
                   System.out.println(leap + " is a leap year.");
               }else {
                   System.out.println(leap + " is not a leap year.");
               }
           }else {
               System.out.println(leap + " is a leap year.");
           }
        }else {
            System.out.println(leap+" is not leap year");
        }
    }
}
