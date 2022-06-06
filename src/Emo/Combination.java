package src.Emo;


import java.util.Scanner;

public class Combination {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("type the first number: ");
        int input1=s.nextInt();
        System.out.println("type the second number: ");
         int input2=s.nextInt();

        if (input1<input2){
            System.out.println("input1 should be bigger than "+ input2);
            input1=s.nextInt();
            Calculate(input1, input2);

        }else{
                  Calculate(input1, input2);
        }

    }

         static void Calculate(int input1, int input2){
        int faktoriyel1=1;
        int faktoriyel2=1;
        int faktoriyel3=1;
         int difference=input1-input2;

         for (int i=1; i<=input1; i++){
             faktoriyel1= faktoriyel1*i;

         }
        System.out.println("for " + input1+ " faktoriyel is = "+ faktoriyel1);
         for (int j=1; j<=input2;j++){
             faktoriyel2=faktoriyel2*j;
         }
        System.out.println("for " + input2+ " faktoriyel is = "+ faktoriyel2);
         for (int k=1; k<=difference; k++){
             faktoriyel3=faktoriyel3*k;
         }
        System.out.println("for  (input1-input2) faktoriyel is = "+ faktoriyel3);
         int multi=faktoriyel3*faktoriyel2;
         int combin=faktoriyel1/multi;
        System.out.println("Result is = "+ combin);
    }


}
