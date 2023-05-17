package class16;

public class Cat {
    private String name="mano";
    private String breed;
    private String color;

    public void printInfo(String password) {
        if (password.equals("pass1234")) {
            System.out.println(name);
        } else {
            System.out.println("You need....");
        }


    }
}
