package class17;

public class Cat {
    String name;
    Cat(String catName){
    name=catName;
    }
    Cat(String name,String color){
        System.out.println("2 arguments");
    }
    Cat(int age){
        System.out.println("int argument constructor");

    }
    Cat(double weight){
        System.out.println("double");
    }
    void printName(){
        System.out.println(name);
    }


    public static void main(String[] args) {

        Cat cat=new Cat("mikki","grey");
                 cat.printName();
    }
}
