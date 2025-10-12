package Activities;

public class Car
{
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
    public Car() {
        tyres = 4;
        doors = 4;
    }
    public void displayCharacteristics() {
        System.out.println("Car Color: " + color);
        System.out.println("Transmission: " + transmission);
        System.out.println("Make: " + make);
        System.out.println("Number of doors: " + doors);
        System.out.println("Number of tyres: " + tyres);
    }
    public void accelarate() {
        System.out.println("Car is moving forward.");
    }
    public void brake() {
        System.out.println("Car has stopped.");
    }
}
