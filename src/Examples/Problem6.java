package src.Examples;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        System.out.println("please enter your score: ");
        Scanner note1= new Scanner(System.in);
        int s=note1.nextInt();

        if (s>100){
            System.out.println("Wrong number. Please enter a valid score...");
        }
    else if (s>=90){
        System.out.println(" AA");
    }else if (s>=80){
        System.out.println("BB ");
    } else if (s>=70) {
        System.out.println("CC");
    }else {
            System.out.println("FF");
        }
    }
}
