package class20;

public class Animal {
    String name;  //fields,properties,attributes,instance variables
    int age;
    String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    void eat(){
        System.out.println("eating");
    }
     void drink(){
        System.out.println("drinking");

    }
     void walk(){
        System.out.println("walking");
    }
}
    class Dog extends Animal {
        public Dog(String name, int age, String color) {
            super(name, age, color);
        }
@Override
       void eat(){

            System.out.println("I like eat");

        }
    }
    class Cat extends Animal {
        public Cat(String name, int age, String color) {
            super(name, age, color);
        }
    }

    class Horse extends Animal {
        public Horse(String name, int age, String color) {
            super(name, age, color);
        }
    }