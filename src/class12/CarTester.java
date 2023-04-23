package class12;

public class CarTester {
    public static void main(String[] args) {

        Car car=new Car();
        car.color="red";
        car.brandName="BMW";
        car.weight=556;
        car.isAutomatic=true;
        car.starCar();
        car.stopCar();
        car.turn();

        Car car1=new Car();
        car1.brandName="Audi";
        car1.color="blue";
        car1.weight=900;
        car1.isAutomatic=true;
        car1.turn();
        car1.stopCar();
        car1.starCar();

    }
}
