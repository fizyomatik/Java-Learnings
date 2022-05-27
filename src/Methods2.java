package src;

import src.Emo.emo;

public class Methods2 {
    public static void main(String[] args) {
        System.out.println("Who are you?");

        //Here i defined my own class with : MyUtils..
        // MyUtils can be found in the file called MyUtils.java...
        MyUtils.SomeRead("My name is Emo ");
        MyUtils.SomeRead(34);
        MyUtils.sum2Num(28, 312);
        int myvar= MyUtils.add10(19);
        System.out.println(myvar);
        emo.Do();
        // FOR NON STATIC
         MyUtils con= new MyUtils();
        con.priNumber(20,30);
        System.out.println(con);

    }


}
