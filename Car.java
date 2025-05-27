
public class Car {
    String make;
    String model;
    int year;

    void displayDetails() {
        System.out.println(make + " " + model + " " + year);
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.make = "Toyota";
        car.model = "Corolla";
        car.year = 2022;
        car.displayDetails();
    }
}
