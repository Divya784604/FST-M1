package Activities;

public class Activity8 {
    public static void main(String[] args) {
        try {
            validateNumber(-5);
        } catch (CustomException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }
    }
    public static void validateNumber(int number) throws CustomException {
        if (number < 0) {
            throw new CustomException("Number must be positive. Given: " + number);
        }
        System.out.println("Number is valid: " + number);
    }
}
