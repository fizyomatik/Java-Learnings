package src.Examples;

import java.util.Scanner;

public class SchoolNoteExamp2 {
    public static void main(String[] args) {
        System.out.println("Please enter your score: ");
        Scanner s=new Scanner(System.in);
       int myScore= s.nextInt();
       if (myScore>=90){
           System.out.println("Congrats. You have passed the exam...");
           System.out.println("AA");
       } else if (myScore>70 & myScore<90) {
           System.out.println("Congrats. You have passed the exam...");
           System.out.println(" BB ");

       }else {
           System.out.println("Unfortunately you could not pass the exam..");
       }


    }
}
