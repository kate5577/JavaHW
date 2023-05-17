package class21;

public class E1Poly {
    public static void main(String[] args) {
Animal[]animals={new Cat("miki","gray","german"),
        new Dog("hen","gray","maltese"),
        new Horse("mik","brown","tre")
};

for(Animal animal:animals){
    animal.sleep();
    animal.speak();
    animal.eat();
}

Animal animal=new Cat("miki","gray","german");
Cat c=(Cat)animal;
        c.eat();
        ((Cat)animal).eat();





        /*Cat cat=new Cat("miki","gray","german");
        cat.sleep();
        cat.speak();
        cat.eat();

        Dog dog=new Dog("hen","gray","maltese");
       dog.sleep();
        dog.speak();
       dog.eat();

       Horse horse=new Horse("mik","brown","tre");
       horse.sleep();
       horse.speak();
       horse.eat();*/


    }
}
