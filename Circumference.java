import java.util.Scanner;

public class Circumference {


     static int Circum(){
        Scanner scan=new Scanner(System.in);
        int radius=scan.nextInt();
        double cir=0, area=0;
        cir= 2*Math.PI*radius;
        area=Math.PI*radius*radius;
        System.out.println("Cir: " + cir);
         System.out.println("Area: " + area);


         return radius;
     }

    public static void main(String[] args) {
        System.out.println("Please enter a number for radius: ");

       Circum();




    }
}
