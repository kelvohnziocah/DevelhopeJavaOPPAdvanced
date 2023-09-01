package DevelhopeJavaOPPAdvanced;
enum Months {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
        }
public class EnumerationExercise {
    public static void main (String[] args){
        for (Months month : Months.values()){
            String monthName = month.toString();
            if (monthName.endsWith("Y") || monthName.endsWith("y")){
                System.out.println(monthName + ": ends with y");
            }
            else {
                System.out.println(monthName + ": does not end with y");
            }
        }
    }
}
