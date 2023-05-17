package class21;
class Animal {
    String name;
    String color;
    String breed;

  public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }
    void speak(){
        System.out.println("animals speak");
    }
    void sleep(){
        System.out.println("Animal sleep");
    }
    void eat(){
        System.out.println("Animal eat");
    }

    void printInfo(){
    System.out.println(name+" "+color+" "+breed);
}
}
class Cat extends Animal{

    public Cat(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("meow....");
    }
    @Override
    void eat(){
        System.out.println("eat fish");
    }
    @Override
    void sleep(){
        System.out.println("sleep 18 hours");
    }


}

public class Dog extends Animal {

    public Dog(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("woof...");
    }
    @Override
    void sleep(){
        System.out.println("sleep 10 h");
    }
    @Override
    void eat(){
        System.out.println("Eat bones");
    }
}
class Horse extends Animal{


    public Horse(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void sleep(){
        System.out.println("sleep 2-3 h");
    }
    @Override
    void eat(){
        System.out.println("eat grass");
    }
    @Override
    void speak(){
        System.out.println("ho ho");
    }
}

class AnimalTester{
    public static void main(String[] args) {
        Dog dog=new Dog("hen","white","maltese");
        dog.printInfo();

        Animal dog1=new Dog("shaggy","black","german");
           dog1.printInfo();

           Animal[]animals={new Dog("shaggy","black","german"),new Cat("tom","blue","persian")};

           for(Animal an:animals){
               an.printInfo();
           }
           double d=10;
           Animal dog2=new Dog("shaggu","black","german");


              int g=(int)10.5;
           Dog dog3=(Dog)new Animal("shaggu","black","german");


    }
}
