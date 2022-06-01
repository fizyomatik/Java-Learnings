package src;

public class WorkingWithStrings2 {
    public static void main(String[] args) {
        String str = "hey there, since i was calling you since morning. Hey there!";
        int a = str.indexOf("there");
        int b =str.indexOf("there",5);
        int c = str.lastIndexOf("since");
        int d= str.indexOf("since");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

}
