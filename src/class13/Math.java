package class13;

public class Math {
    void add(int num1,int num2){
        System.out.println(num1+num2);
    }
    void multiply(int num3,int num4){
        System.out.println(num3*num4);
    }

    public static void main(String[] args) {

        Math math=new Math();
        math.add(10,10);

        math.multiply(2,5);



    }
}
