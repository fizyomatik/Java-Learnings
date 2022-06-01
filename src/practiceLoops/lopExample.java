package src.practiceLoops;

public class lopExample {
    public static void main(String[] args) {
        String name= "asdfghjklasdfhjkl";
        int a = name.length();

        for (int i= name.length() -1 ; i >= 0  ; i--) {

            System.out.println("char: " + name.charAt(i));
        }

    }
}
