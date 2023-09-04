package DevelhopeJavaOPPAdvanced;

public class JUnitExercise {
    public static void main(String[] args){
        System.out.println("substratciton of 4 form 3 = " + subtraction(4,3));
        System.out.println("multiplication of 2 and 3 = " +multiplication(2, 3));
    }
    public static int subtraction( int minuend, int subtrahend){
        int substraResult = (minuend - subtrahend);
        return substraResult;
    }
    public static int multiplication (int multiplier, int multiplicand){
        int multResult = (multiplier * multiplicand);
        return multResult;
    }
}
