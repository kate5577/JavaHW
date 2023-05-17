package class20;

public class Parent {
    void getMarry(){
        System.out.println("Marry to the girl");

    }
    private void accessBank(){
        System.out.println("Accessing bank");
    }
    static void printNumber(){
        System.out.println(10);
    }
}

class Axel extends Parent{
    @Override
    void getMarry() {
        System.out.println("I want to marry...");
    }


    }


class ParentTest{
    public static void main(String[] args) {
        Axel axel=new Axel();
        axel.getMarry();
        Axel.printNumber();
    }
}

