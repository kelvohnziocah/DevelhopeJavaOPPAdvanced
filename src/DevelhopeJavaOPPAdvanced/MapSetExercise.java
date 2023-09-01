package DevelhopeJavaOPPAdvanced;

import java.util.*;

public class MapSetExercise {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> months = new LinkedHashMap<>();
        months.put("January", 1);
        months.put("February", 2);
        months.put("March", 3);
        months.put("April", 4);
        months.put("May", 5);
        months.put("June", 6);
        months.put("July", 7);
        months.put("August", 8);
        months.put("September", 9);
        months.put("October", 10);
        months.put("November", 11);
        months.put("December", 12);
        Set<String> monthNames = months.keySet();
        System.out.println("Sets of month names: " + monthNames);
        //convert the values of map to list
        List<Integer> cardinalMonth = new ArrayList<>(months.values());
        System.out.println("List of month numbers: " + cardinalMonth);

        // Convert the values of the Map into an array
        Integer[] MonthArray = months.values().toArray(new Integer[0]);
        System.out.println("Array of month numbers: " + Arrays.toString(MonthArray));
    }
}
