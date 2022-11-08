import java.util.Scanner;

public class Multpl {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();


           if (num%5==0 && num%7==0) {
            System.out.println(num + " is multiple of both 5 and 7");

           }else{
               System.out.println(num + " is not multiple of both  5 and 7");
           }
    }
}
