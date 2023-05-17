package class22;

public class Task3 {
    public int getCount(double[] array, double number) {
        int counter = 0;
        for (double i : array) {
            if (i == number) {
                counter++;
            }
        }
        return counter;
    }
}
