package Activities;

public class Activity2 {
    public static void main(String[] args) {
        // Initialize array
        int[] numbers = {10, 77, 10, 54, -11, 10};
        int targetNumber = 10;
        int expectedSum = 30;
        int sum = 0;
        for (int num : numbers) {
            if (num == targetNumber) {
                sum += num;
            }
        }
        if (sum == expectedSum) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
