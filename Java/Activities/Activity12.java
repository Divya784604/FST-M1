package Activities;

public class Activity12 {
    public static void main(String[] args) {
        Addable ad1 = (num1, num2) -> num1 + num2;
        Addable ad2 = (num1, num2) -> {
            int result = num1 + num2;
            return result;
        };
        System.out.println("Result from ad1: " + ad1.add(5, 10));  // Output: 15
        System.out.println("Result from ad2: " + ad2.add(7, 3));   // Output: 10
    }
}
