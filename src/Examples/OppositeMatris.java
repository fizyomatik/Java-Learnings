package src.Examples;

import java.util.Scanner;

public class OppositeMatris {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("type your argument: ");
        int mat=s.nextInt();

        for (int i=mat-1;i>=0;i--){
            for (int j=0; j<=mat-1;j++){
                 if (i==j){
                     System.out.printf("1");
                 }else {
                     System.out.printf("0");
                 }

            }
            System.out.println();
        }

    }
}
