package class22;

public class AnimalTester {
    public static void main(String[] args) {
        Animal[]animal={new Dog("hen","hen","heb"),new Cat("mik","mik","mik"),new Horse("kl","kl","kl")};
        for(Animal an:animal){
            an.eat();
            an.sleep();
            an.speak();
            an.printInfo();
        }
    }
}
