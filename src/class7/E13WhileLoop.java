package class7;

public class E13WhileLoop {
    public static void main(String[] args) {

        int numb=1;
        int sum=0;
        while(numb<=10){
            sum=sum+=numb;
            numb++;
        }
        System.out.println(sum);
    }
}
