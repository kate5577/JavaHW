package class8;

public class E14NestedLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            for (int j = 1; j<=5 ; j++) {
                System.out.print(j + i+" ");
            }
            System.out.println();
        }
    }
}
