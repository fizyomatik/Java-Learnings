import java.util.Objects;
import java.util.Scanner;

public class Decimal {

    public static void main(String[] args) {
        int dec_num, i=1, quot;
        System.out.println("Please enter a number: ");
        Scanner s=new Scanner(System.in);
        dec_num=s.nextInt();


        char [] hexa= {'0','1','2','3','4','5','6','7','8','9','A', 'B', 'C','D','E','F'};
        quot=dec_num%16;
        System.out.println(hexa[quot]);








    }
}
