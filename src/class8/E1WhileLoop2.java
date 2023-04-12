package class8;

import java.util.Scanner;

public class E1WhileLoop2 {
    public static void main(String[] args) {

        Scanner scaner =new Scanner(System.in);
        System.out.println("Please Enter the start number");
        int start= scaner.nextInt();
        System.out.println("Please Enter the end number");
        int end= scaner.nextInt();

        while(start<=end){
            System.out.println(start);
            start++;
        }



    }
}
