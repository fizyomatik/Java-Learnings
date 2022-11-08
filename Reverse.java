import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter a number: ");
        int number=scan.nextInt();
        int reminder,reverse=0;

        while(number!=0){
            reminder=number%10;
            reverse=reverse*10+reminder;
            number =number/10;

        }
        System.out.println(reverse);






    }
}
