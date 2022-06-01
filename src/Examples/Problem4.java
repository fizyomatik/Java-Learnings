package src.Examples;

public class Problem4 {
    public static void main(String[] args) {
        int a=5, b=5, c=7;
        if (a>b && a<c ){
            System.out.println(".");

        }else {
            System.out.println("a sayisi b ve c arasinda degildir.");
        }

        if ( a>b || a>c){
            System.out.println();
        }else {
            System.out.println("a, b ve c'den daha buyuk degildir.");
        }
        if (a==b && a<c){
            System.out.println("a, b'ye esit ve c'den kucuktur.");
        }
    }
}
