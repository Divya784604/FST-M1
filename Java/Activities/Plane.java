package Activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOff;
    private Date lastTimeLanded;
 public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }
 public boolean onboard(String passengerName) {
        if (passengers.size() < maxPassengers) {
            passengers.add(passengerName);
            return true;
        } else {
            System.out.println("Cannot add passenger: flight is full.");
            return false;
        }
    }

    public void takeOff() {
        lastTimeTookOff = new Date();
        System.out.println("Plane took off at: " + lastTimeTookOff);
    }

    public void land() {
        lastTimeLanded = new Date();
        passengers.clear();
        System.out.println("Plane landed at: " + lastTimeLanded);
    }

    public List<String> getPassengers() {
        return passengers;
    }

    public Date getLastTimeTookOff() {
        return lastTimeTookOff;
    }

    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }
}
