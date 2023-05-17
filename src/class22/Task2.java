package class22;

public class Task2 {

    public double getAver(double[] arr) {

        double average = 0;
        for (double i : arr) {
            average=i+average;
            }
        return average;
        }

    }
