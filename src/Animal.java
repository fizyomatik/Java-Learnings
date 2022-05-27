package src;

public class Animal {
    String gender;
    int age;
    int size;

    public Animal(String gender, int age, int size){
        this.gender=gender;
        this.age=age;
        this.size=size;

    }
    public void eat(){
        System.out.println("Eating...");
    }
    public void breath(){
        System.out.println("breathing...");
    }
}
