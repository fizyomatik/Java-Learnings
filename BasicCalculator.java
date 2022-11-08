import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        BasicCalculator a = new BasicCalculator();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the transaction: ");
        String tran = scan.next();
        System.out.println("Enter second number: ");
        int num2 = scan.nextInt();

        switch (tran) {
            case "+":
                System.out.println(a.toAdd(num1, num2));
                break;
            case "-":
                System.out.println(a.toMinus(num1, num2));
                break;
            case "*":
                System.out.println(a.toMultiple(num1, num2));
                break;
            case "/":
                System.out.println(a.toDivide(num1, num2));
                break;
            default:
                System.out.println(tran + " is not in calculation");

        }

    }

    int toAdd(int x, int y) {
        return x + y;
    }

    int toMinus(int x, int y) {
        return x - y;
    }

    int toMultiple(int x, int y) {

        return x * y;
    }

    double toDivide(double x, double y) {
        if (y == 0) {return 0;}
           return x/y;
    }

}
