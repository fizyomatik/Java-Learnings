package src.Examples;

import java.util.Scanner;

public class Matris {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int mat = s.nextInt();


        for (int j=0; j<mat; j++) {



            for (int i = 0; i < mat; i++) {
              if (i==j) {
                  System.out.printf("1");
              }else{
                  System.out.printf("0");
              }

            }
            System.out.println();


        }
    }
}
