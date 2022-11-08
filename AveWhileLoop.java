import java.util.Scanner;

public class AveWhileLoop {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int sum=0,count=0;

        while(count<5){


                System.out.println("Please Enter number: ");
                int num=scan.nextInt();
                 sum=sum+num;
                count++;
        }

        double average= sum/count;
        System.out.println("Average of 5 numbers is "+average);





    }
}
