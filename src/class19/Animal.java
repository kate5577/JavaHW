package class19;

public class Animal {
    private String name;
    private int age;
    private String color;
    private String breed;
    private double weight;

    void printName() {
        System.out.println(name + " " + age + " " + color + " " + breed + " " + weight);
    }

    public Animal(String name, int age, String color, String breed, double weight) {

        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.weight = weight;
    }
}

   class Dog extends Animal {
        double price;


        public Dog(String name, int age, String color, String breed, double weight, double price) {
            super(name, age, color, breed, weight);
            this.price = price;

        }

        void printInfo() {
            super.printName();
            System.out.println(price);
        }
    }

    class Cat extends Animal {
        public Cat(String name, int age, String color, String breed, double weight) {
            super(name, age, color, breed, weight);
        }
    }

    class Horse extends Animal {

        public Horse(String name, int age, String color, String breed, double weight) {
            super(name, age, color, breed, weight);
        }
    }

    class AnimalTester {
        public static void main(String[] args) {


            Dog dog = new Dog("Tom", 12, "White", "Maltese", 12.5, 3000);
            dog.printInfo();

        }


    }





