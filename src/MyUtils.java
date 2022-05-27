package src;

 public class MyUtils {
    public static void SomeRead(String argument){
        System.out.println("Hey, it is me: " + argument);
    }
    public static void SomeRead(int argument){
        System.out.println("Hey, it is me: " + argument);
    }
    public static void sum2Num(int firstArg, int secondArg){
        System.out.println(firstArg + secondArg);
    }
    public static int add10(int SumAdd){
        int result = SumAdd + 10 ;
        return result;
    }
    public int priNumber(int smallInt, int bigInt){
        int sumsum= smallInt + bigInt;
        return sumsum;
    }
}
