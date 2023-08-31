package DevelhopeJavaOPPAdvanced;

import java.util.HashMap;
import java.util.Map;

public class MapExercise {
    public static void main (String[] args){
        Map<Integer, String> numbers =new HashMap<>();
        numbers.put(1, "one");
        numbers.put(2, "two");
        numbers.put(3, "three");
        numbers.put(4, "four");
        numbers.put(5, "five");
        Map<Integer, String> italianiNumbers = new HashMap<>();
        italianiNumbers.put(1, "uno");
        italianiNumbers.put(3, "tre");
        italianiNumbers.put(5, "cinque");
        italianiNumbers.put(7, "sette");
        italianiNumbers.put(9, "nove");
        numbers.putAll(italianiNumbers);
        for(Map.Entry<Integer, String> e : numbers.entrySet()){
            System.out.println(e.getKey() + ":" + e.getValue());
        }
        System.out.println("****Printing specific keys and values*****");
        for (int keysprint = 5; keysprint<= 9; keysprint++){
            if (numbers.containsKey(keysprint)){
                System.out.println("Values of key "+ keysprint + " : " + numbers.get(keysprint));
            }
            else {
                System.out.println("Values of key " + keysprint + " : " + "No associated value");
            }
        }
    }
}
