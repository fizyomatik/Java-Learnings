package src.Emo;

public class PlumTree extends Plants{
    public PlumTree(int size, String name, String color){
        super(size, name, color);


    }

    @Override
    public void fruit() {
        System.out.println("Plum is a fruit..");
    }

}
