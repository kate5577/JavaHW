package class16;

public class PersonTester {
    public static void main(String[] args) {

        Person person=new Person();
       // person.password();we cant use the private variables from another class
          //  person.printPassword();
       // Person.printBalance();

        System.out.println(person.SSN);
        System.out.println(person.name);
    }
}

