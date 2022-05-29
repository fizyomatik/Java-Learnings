package src.Emo;

public class Flowers extends Plants implements Smell{

    public Flowers(int size, String name, String color){
        super(size, name, color);


    }

    @Override
    public void fruit() {
        System.out.println("Flower is not a fruit..");
    }

    public void coloring(){
        System.out.println("Flowers are coloring...");
    }

    @Override
    public void smell() {
        System.out.println("Flowers smelling really good!!!");

    }
}
