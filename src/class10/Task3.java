package class10;

public class Task3 {
    public static void main(String[] args) {

        String[] cars = {"Tires", "Windows", "Steering Wheel", "Breaks", "Seat", "Key", "Battery"};
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + " ");
        }
        System.out.println();
        for (String car : cars) {
            System.out.println(car);

        }
    }
}
