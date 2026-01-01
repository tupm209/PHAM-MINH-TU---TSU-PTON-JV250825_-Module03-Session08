package bai_2;

public class Car extends Vehicle{

    @Override
    void displayInfo() {
        System.out.println("Car name: " + getName() + ", Speed: " + getSpeed() + " km/h");
    }
}
