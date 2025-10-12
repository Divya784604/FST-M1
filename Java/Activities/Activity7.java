package Activities;

public class Activity7 {
    public static void main(String[] args) {
        Bicycle myBike = new Bicycle(10);

        myBike.displayStatus();

        myBike.speedUp(15);
        myBike.applyBrake(5);
        myBike.displayStatus();
    }
}
