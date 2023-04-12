package class4;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the amount of loan is needed");
        int amount= scanner.nextInt();
        if(amount<=200000){
            System.out.println("you're approved");
        }else{
            System.out.println("You're not approved");
        }


    }
}
