package class4;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your age");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Ypu are eligible for driver license ");
        } else {
            System.out.println("You can get your lerner permit first");
        }
    }
}
