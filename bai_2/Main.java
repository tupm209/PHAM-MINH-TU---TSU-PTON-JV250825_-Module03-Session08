package bai_2;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.setName("Toyota");
        car.setSpeed(120);
        car.start();
        car.displayInfo();

        Vehicle bike = new Bike();
        bike.setName("Yamaha");
        bike.setSpeed(80);
        bike.start();
        bike.displayInfo();
    }
}
