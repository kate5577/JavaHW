package class15;

public class Dog {
    String color;
    int age;
    static double weight;

    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.weight=20;
        dog.color="Green";

        Dog dog1=new Dog();
        System.out.println(dog1.weight);
        System.out.println(dog1.color);


    }
}

