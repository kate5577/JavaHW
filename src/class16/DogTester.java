package class16;

public class DogTester {
    public static void main(String[] args) {

        Dog dog1=new Dog();
        dog1.breed="German";
        dog1.color="Black";
        dog1.name="jack";


        Dog dog2=new Dog();
        dog2.breed="persian";
        dog2.color="white";
        dog2.name="Sam";

        dog1.printInfo();

        Dog.age=20;
        Dog.printInfo2();



    }
}

