package class22;

public interface ArrayUtil {
    public boolean searchArr(int []array,int number);

}

class Main implements ArrayUtil{

    @Override
    public boolean searchArr(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if(array[i]==number){
return true;
            }
        }

        return false;
    }
}
