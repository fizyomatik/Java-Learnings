package src;

public class Fish {
    String color;
    String name;
    int size;
    int weight;

public  Fish(String color, String name, int size, int weight){
    super();
    this.color=color;
    this.name=name;
    this.size=size;
    this.weight=weight;

}


    public void Attribute(){
        System.out.println("My color is " + color);
        System.out.println("I am called " + name);
        System.out.println("My size is " + size +" cm long");
        System.out.println("I am " + weight + "kilo");
    }
}
