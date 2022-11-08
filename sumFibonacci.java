public class sumFibonacci {

    public static void main(String[] args) {
        int n1=0, n2=1, k=10,sum=0;
        for (int i=2; i<= k; i++) {

            int n3 = n1 + n2;
            System.out.println("" + n3);

            n1 = n2;
            n2 = n3;

            if (n3 % 2 == 0) {

                sum = sum + n3;

            }

        }
        System.out.println(sum);
    }
}
