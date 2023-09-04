package DevelhopeJavaOPPAdvanced;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnitexerciseTest {
    @Test
    public void multiplicationTest(){
        int result = JUnitExercise.multiplication(4,5);
        assertEquals(20, result, "should be equal to 20");
    }
    @Test
    public void multiplyByZero(){
        int result = JUnitExercise.multiplication(8, 0);
        assertEquals(0, result, "multiply be 0 always equals to 0");
    }
    @Test
    public void substrationTest(){
        int result = JUnitExercise.subtraction(12, 7);
        assertEquals(5, result, "The answer is 5");
    }
}
