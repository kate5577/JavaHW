package class16;

import java.util.Scanner;

public class Person {
    public String name="Kate";//for all project
    String SSN="1234567899";//default cant be used with diff package!(just for one package)
    private String password;//private just for one class
    private static double bankBalance=12000;

    private void printPassword(){
        System.out.println(password);
    }
    private static void printBalance(){
        System.out.println(bankBalance);
    }

    public static void main(String[] args) {

        Person farwa=new Person();
        farwa.password="12234";
        farwa.printPassword();
        System.out.println(Person.bankBalance);
        System.out.println(farwa.SSN);
        System.out.println(farwa.name);

    }

}
