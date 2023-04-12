package class7;

import java.util.Scanner;

public class E14WhileLoop {
    public static void main(String[] args) {


        Scanner scaner=new Scanner(System.in);
        System.out.println("Please Enter any number");
        int number= scaner.nextInt();
        int numb=1;
        while(numb<=number){
            System.out.print(numb+" ");
            numb++;
        }




        }
    }

