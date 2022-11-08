public class Palindrome {


    public static void main(String[] args) {

      String s="ana";
      String s1="";



             for (int i=0;i<=s.length()-1;i++) {

                 s1= s.charAt(i) + s1;


             }
             System.out.println(s1);

             if (s != s1){
                 System.out.println("is  not a Palindrome");

             }else {
                 System.out.println("it is  a Palindrome");
             }
    }
}

