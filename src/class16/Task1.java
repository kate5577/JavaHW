package class16;


public class Task1 {
    int sumArr(int[] arr){
        int sum=0;

        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];

        }
        return sum;
    }

    public static void main(String[] args) {
        Task1 obj=new Task1();
        int [] array={10,40,15};

        int result = obj.sumArr(array);
        System.out.println(result);

        //another way :int result=obj.sumArr(new int[]{10,10,10});and print the result
    }


}

