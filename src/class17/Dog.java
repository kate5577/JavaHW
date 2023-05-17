package class17;

import java.sql.SQLOutput;

public class Dog {

    private String name;
    private String color;
    private String breed;
    private int age;

    Dog(String dogName,String dogColor,String dogBreed,int dogAge){


     name=dogName;
     color=dogColor;
     breed=dogBreed;
      age=dogAge;

    }

    void printInfo(){
        System.out.println(name+" "+color+" "+breed+" "+age);

    }

    public static void main(String[] args) {
       /* Dog obj=new Dog();
        Dog obj1=new Dog();
        Dog obj2=new Dog();
        Dog obj3=new Dog();
        Dog obj4=new Dog();

        obj.name="kiki";
        obj.color="white";
        obj.breed="german";
        obj.age=16;
        obj.printInfo();

        obj1.name="hen";
        obj1.color="black";
        obj1.breed="mops";
        obj1.age=13;
        obj1.printInfo();

        obj2.name="olivka";
        obj2.color="white";
        obj2.breed="maltese";
        obj2.age=8;
        obj2.printInfo();*/

           Dog dog1=new Dog("jack","black","persian",12);
           dog1.printInfo();
           Dog dog2=new Dog("shaggy","beige","hacky",8);
                   dog2.printInfo();
           Dog dog3=new Dog("fluffy","pink","maltese",7);
           dog3.printInfo();
           Dog dog4=new Dog("Papi","black","asian",15);
              dog4.printInfo();

    }

}
