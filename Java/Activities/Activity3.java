package Activities;

public class Activity3
{
    static final double EARTH_YEAR_SECONDS = 31557600;
    static final double MERCURY = 0.2408467;
    static final double VENUS = 0.61519726;
    static final double MARS = 1.8808158;
    static final double JUPITER = 11.862615;
    static final double SATURN = 29.447498;
    static final double URANUS = 84.016846;
    static final double NEPTUNE = 164.79132;
    public static void main(String[] args) {
        double seconds = 1000000000;
        double earthYears = seconds / EARTH_YEAR_SECONDS;

        System.out.printf("Age in seconds: %.0f\n", seconds);
        System.out.printf("Earth years: %.2f\n", earthYears);
        System.out.printf("Mercury years: %.2f\n", earthYears / MERCURY);
        System.out.printf("Venus years: %.2f\n", earthYears / VENUS);
        System.out.printf("Mars years: %.2f\n", earthYears / MARS);
        System.out.printf("Jupiter years: %.2f\n", earthYears / JUPITER);
        System.out.printf("Saturn years: %.2f\n", earthYears / SATURN);
        System.out.printf("Uranus years: %.2f\n", earthYears / URANUS);
        System.out.printf("Neptune years: %.2f\n", earthYears / NEPTUNE);
    }
}
