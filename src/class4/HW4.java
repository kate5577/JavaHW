package class4;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your City");
        String city = scanner.next();
        System.out.println("What is temperature in your city in F");
        int temperature = scanner.nextInt();
        int temperatureC = (temperature - 32) * 5 / 9;

        System.out.println("The temperature is the city "+city+" is "+temperatureC);
    }
}