package Activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Cherry");
        hs.add("Date");
        hs.add("Elderberry");
        hs.add("Fig");
        System.out.println("Initial HashSet size: " + hs.size());
        boolean removed = hs.remove("Date");
        System.out.println("Removed 'Date': " + removed);
        boolean removedNonExistent = hs.remove("Grapes");
        System.out.println("Tried to remove 'Grapes' (not in set): " + removedNonExistent);
        String checkItem = "Banana";
        if (hs.contains(checkItem)) {
            System.out.println("'" + checkItem + "' is in the set.");
        } else {
            System.out.println("'" + checkItem + "' is NOT in the set.");
        }
        System.out.println("Updated HashSet: " + hs);
    }
}
