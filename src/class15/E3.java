package class15;

public class E3 {

    int sumArr(int[] arr){
        int sum=0;

        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];

        }
        return sum;
    }

    public static void main(String[] args) {
        E3 obj=new E3();
        int [] array={10,40,15};

        int result = obj.sumArr(array);
        System.out.println(result);
    }


    }

