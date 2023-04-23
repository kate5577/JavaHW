package class11;

public class E7Arrays {
    public static void main(String[] args) {

        boolean[][] arr2D = {
                {true, false, true, true, false},
                {true, false, false, false, false}

        };
        int counter = 0;
        for (boolean[] arr1D : arr2D) {
            for (boolean name : arr1D ){
                if (name){
                    counter++;
                }
            }

        }
        System.out.println(counter);

    }
}
