import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        //here we are going to try to find Nth term of Fibonacci

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Nth term of Fibonacci that you wanna see: ");
        //n is the one that we want to find out
        int n=scan.nextInt();

        int [] f= new int[20];
        f[0]=0;
        f[1]=1;

        //System.out.print(f[0]+",");
        //System.out.print(f[1]+",");



        for (int i=2; i<=n; i++){

            f[i]=f[i-1]+f[i-2];
            //System.out.print(f[n]+",");
        }
        System.out.print(f[n]);
    }
}
