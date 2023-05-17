package class18;

import com.sun.security.jgss.GSSUtil;

public class AnimalTester {
    public static void main(String[] args) {

        Horse horse=new Horse();
        horse.eat();
        horse.color="Black";
        System.out.println(horse.color);


        Cat cat=new Cat();
        cat.name="Mano";
        cat.sleep();
        cat.run();

    }

}
