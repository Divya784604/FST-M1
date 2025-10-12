package Activities;

public class Activity1
{
    public static void main(String[] args)
    {
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.transmission = "Manual";
        myCar.make = 2022;
        myCar.displayCharacteristics();
        myCar.accelarate();
        myCar.brake();
    }
}