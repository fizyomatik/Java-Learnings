package src.Emo;

public abstract class Plants {
    int size;
    String name;
    String color;

    public Plants(int size, String name, String color){
        super();
        this.size=size;
        this.name=name;
        this.color=color;

    }

    public void grow(){
        System.out.println("Growing...");
    }
    public void colorChange(){
        System.out.println("Changing the color step by step...");
    }
    public abstract void fruit();
}
