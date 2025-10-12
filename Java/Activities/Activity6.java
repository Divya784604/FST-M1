package Activities;

public class Activity6 {
    public static void main(String[] args)
    {
        Plane plane = new Plane(3);
        plane.onboard("Alice");
        plane.onboard("Bob");
        plane.onboard("Charlie");
        plane.onboard("David");
        plane.takeOff();
        System.out.println("Passengers on board: " + plane.getPassengers());
        plane.land();
        System.out.println("Passengers after landing: " + plane.getPassengers());
    }
}
