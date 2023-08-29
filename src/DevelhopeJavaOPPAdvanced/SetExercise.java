package DevelhopeJavaOPPAdvanced;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExercise {
    public static void main (String[] args) {
        Set<String> DaysOfTheWeek = new HashSet<>();
        DaysOfTheWeek.add("Monday");
        DaysOfTheWeek.add("Tuesday");
        DaysOfTheWeek.add("Wednesday");
        DaysOfTheWeek.add("Thursday");
        DaysOfTheWeek.add("Friday");
        DaysOfTheWeek.add("Saturday");
        DaysOfTheWeek.add("Sunday");
        System.out.println("Days of the week " + DaysOfTheWeek);
        Set<String> DaysOfTheWeekLinked = new LinkedHashSet<>();
        DaysOfTheWeekLinked.add("Monday");
        DaysOfTheWeekLinked.add("Tuesday");
        DaysOfTheWeekLinked.add("Wednesday");
        DaysOfTheWeekLinked.add("Thursday");
        DaysOfTheWeekLinked.add("Friday");
        DaysOfTheWeekLinked.add("Saturday");
        DaysOfTheWeekLinked.add("Sunday");
        System.out.println("Days of the week Arranged " + DaysOfTheWeekLinked);
        Boolean daysEquals;
        daysEquals = DaysOfTheWeek.equals(DaysOfTheWeekLinked);
        System.out.println(daysEquals);

    }
}
