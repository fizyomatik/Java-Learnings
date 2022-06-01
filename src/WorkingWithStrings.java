package src;

public class WorkingWithStrings {
    public static void main(String[] args) {
        String a = "hello sdfs 22 &(";
        System.out.println(a.length());
        System.out.println(a.charAt(6));

        String str="ABCDEFG";

        //  String extractedString = str.substring(2);
        // String extractedString = str.substring(1,2);
        String extractedString = str.substring(2,5);
        System.out.println(extractedString);
        System.out.println(str);

        System.out.println();
         String m = "hello";
         String b = "there!";
        if (m.equals("hello")){
            System.out.println("They are equal!");
        }
        if (b.equalsIgnoreCase("TheRe!")){
            System.out.println("Printed!");
        }
    }

}
