package src;

public class Earth2 {
    public static void main(String[] args) {
        Human2 human1=new Human2("Rim", 23 , 44, "blue");
        Human2 human2= new Human2("Jack", 44, 66, "green");
        Human2 human3= new Human2("Emo",35, 76, "black" );

        human1.speak();
        human2.speak();
        human3.speak();
    }
}
