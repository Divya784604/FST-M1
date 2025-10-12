package Activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Random indexGen = new Random();

        System.out.println("Enter numbers (type 'done' to finish):");
        while (true) {
            String input = scan.next();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                int num = Integer.parseInt(input);
                list.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer or 'done' to stop.");
            }
        }
        if (list.isEmpty()) {
            System.out.println("No numbers entered.");
        } else {
            int randomIndex = indexGen.nextInt(list.size());

            System.out.println("Random index generated: " + randomIndex);
            System.out.println("Value at random index: " + list.get(randomIndex));
        }

        scan.close();
    }
}

