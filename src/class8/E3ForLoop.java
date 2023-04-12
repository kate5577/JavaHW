package class8;

public class E3ForLoop {
    public static void main(String[] args) {
        int sum=0;



        for (int numb = 1; numb <= 30 ; numb++) {
            if(numb%2==0){
                sum=sum+numb;
            }
        }
        System.out.println(sum);




    }
}
