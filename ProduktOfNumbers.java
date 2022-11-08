import java.util.Scanner;

public class ProduktOfNumbers {



    public static void main(String[] args) {


        System.out.println("Enter a real number: ");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();

        int product=1;
        while (num !=0){
            product=product*(num%10);
            num=num/10;
        }
        System.out.println(product);

    }
}
