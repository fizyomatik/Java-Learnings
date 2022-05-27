package src;

public class Earth {
    public static void main(String[] args) {
        Human tom;
        tom =new Human();
        tom.Age= 32;
        tom.heightInInches= 23;
        tom.EyeColor= "Green";
        tom.name= "Emrullah";
        tom.speak();
        tom.walk();
        tom.eat();
        System.out.println();

        Human jon;
        jon =new Human();
        jon.name="Jon Joe";
        jon.Age=44;
        jon.EyeColor="Saru";
        jon.heightInInches=35;
        jon.speak();
        jon.walk();

        jon.eat();
    }
}
