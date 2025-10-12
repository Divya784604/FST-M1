package Activities;

public class Bicycle implements BicycleParts, BicycleOperations {
    private int currentSpeed;
    public Bicycle(int startSpeed) {
        this.currentSpeed = startSpeed;
    }
    public void speedUp(int increment) {
        currentSpeed += increment;
        System.out.println("Speed increased. Current speed: " + currentSpeed);
    }
    public void applyBrake(int decrement) {
        currentSpeed -= decrement;
        if (currentSpeed < 0) currentSpeed = 0;
        System.out.println("Brake applied. Current speed: " + currentSpeed);
    }
    public void displayStatus() {
        System.out.println("Tyres: " + tyres);
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Current Speed: " + currentSpeed);
    }
}
