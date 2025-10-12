package Activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Alice");
        myList.add("Bob");
        myList.add("Charlie");
        myList.add("Diana");
        myList.add("Ethan");
        System.out.println("All names in the list:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println((i + 1) + ". " + myList.get(i));
        }
        String thirdName = myList.get(2);
        System.out.println("\n3rd name in the list: " + thirdName);
        String nameToCheck = "Bob";
        if (myList.contains(nameToCheck)) {
            System.out.println("\nThe list contains: " + nameToCheck);
        } else {
            System.out.println("\nThe list does not contain: " + nameToCheck);
        }
        System.out.println("\nNumber of names in the list: " + myList.size());
        myList.remove("Charlie");
        System.out.println("Removed 'Charlie' from the list.");
        System.out.println("New number of names in the list: " + myList.size());
    }
}
