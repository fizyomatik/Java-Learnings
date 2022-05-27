package src;

public class Human {
    String name;
    String EyeColor;
    int Age;
    int heightInInches;

  // Constructor method have always exact same name as class name...

    public  Human(){

    }

    public void  speak(){
        System.out.println("My name is " + name);
        System.out.println("My eye color is " + EyeColor);
        System.out.println("I am " + Age + " years old");
        System.out.println("I am " + heightInInches + " inches tall");
    }
    public void eat(){
        System.out.println(name + " is eating..");           }

    public void walk(){
        System.out.println( name +" is walking...");
    }
}
