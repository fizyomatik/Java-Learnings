
import java.util.Scanner;

public class GeoMean {
    public static void main(String[] args) {


             Scanner scan=new Scanner(System.in);
             int num=scan.nextInt();




             for (int i=2;i<num;i++){
                 int isprime=1;



                    for (int j=2;j<i;j++){

                       if (i%j==0){

                           isprime=0;
                          break;

                       }
                    }

                    if (isprime==1){

                        System.out.println(i);
                    }


             }

   }
}
