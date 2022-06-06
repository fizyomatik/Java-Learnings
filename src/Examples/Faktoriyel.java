package src.Examples;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int faktor= s.nextInt();
        int num=1;


        for (int i=1; i<=faktor; i++){
            num=num *i ;

        }
        System.out.println(faktor + "!= " + num);
    }
}
