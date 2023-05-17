package class22;

public abstract class Animal {
    private String name;
    private String color;
    final private  String breed;
    Animal(String name,String color,String breed){
        this.name=name;
        this.color=color;
        this.breed=breed;

    }

    abstract void speak ();
  abstract void eat();
    abstract void sleep();
    void printInfo(){
        System.out.println(name+" "+color+" "+breed);
    }

}
 class Dog extends Animal{

     Dog(String name, String color, String breed) {
         super(name, color, breed);
     }

     @Override
    void speak(){
    System.out.println("Dog speak");
}
@Override
    void eat(){
    System.out.println("Dog eat");
}
@Override
void sleep(){
    System.out.println("Dog sleep");
}
}
class Cat extends Animal{
    Cat(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void speak(){
        System.out.println("Cat speak");
    }
    @Override
    void eat(){
        System.out.println("Cat eat");
    }
    @Override
    void sleep(){
        System.out.println("Cat sleep");
    }

}
class Horse extends Animal{
    Horse(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void speak(){
        System.out.println("Horse speak");
    }
    @Override
    void eat(){
        System.out.println("Horse eat");
    }
    @Override
    void sleep(){
        System.out.println("Horse sleep");
    }

}

