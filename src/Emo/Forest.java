package src.Emo;

public class Forest {
    public static void main(String[] args) {
       PlumTree plum1=new PlumTree(11, "plum", "green");
       plum1.grow();
       Flowers flow1= new Flowers(14, "Rose", "red");
       flow1.grow();
       flow1.smell();
       plum1.fruit();
       flow1.fruit();

    }
}
